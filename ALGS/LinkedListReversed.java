package DZ.ALGS;

import java.util.Iterator;

public class LinkedListReversed {
    public static void main(String[] args) {
        SingleLList<Temp> tempList = new SingleLList<>();
        tempList.addToEnd(new Temp (1, "Ivan"));
        tempList.addToEnd(new Temp (2, "Petr"));
        tempList.addToEnd(new Temp (3, "Andrey"));
        tempList.addToEnd(new Temp (4, "Georgiy"));

        for (Temp temp: tempList) {
            System.out.println(temp);
        }

        tempList.reverseList();

        System.out.println("-------------------");

        for (Temp temp: tempList) {
            System.out.println(temp);
        }
    }

    static class Temp{
        int id;
        String name;

        public Temp(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Temp{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static class SingleLList<T> implements Iterable<T> {
        ListItem<T> head;
        ListItem<T> tail;

        @Override
        public Iterator<T> iterator(){
            return new Iterator<T>() {
                ListItem<T> current = head;
                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }
        private static class ListItem<T>{
            T data;
            ListItem<T> next;
        }

        public boolean isEmpty(){
            return head == null;
        }

        public void addToEnd(T item){
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;
            if (isEmpty()){
                head = newItem;
                tail = newItem;
            } else {
                tail.next = newItem;
                tail = newItem;
            }
        }

        public void reverseList(){
            if (!isEmpty() && head.next != null){
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;
                while (current != null){
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }
        }
    }
}
