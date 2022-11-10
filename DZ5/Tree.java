package DZ.DZ5;

//         1
//       /   \
//      2      3
//     /     /   \
//    4     5     6
//  /   \        / \
// 7     9     11   20

public class Tree {

    public static void main(String[] args) {
        Node root =
                new Node(1,
                        new Node(2,
                                new Node(4, new Node(7), new Node(9)),null),
                        new Node(3, new Node(5),
                                new Node(6, new Node(11), new Node(20))));
        System.out.println("Nodes sum = " + root.sum());
    }
    static class Node {
        int value;
        Node left;
        Node right;

        public Node (int value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
        public Node(int value){
            this.value = value;
        }

        public int sum () {
            int summ = value;
            if (left != null){
                summ += left.sum();
            }
            if (right != null){
                summ += right.sum();
            }

            return summ;
        }
    }
}
