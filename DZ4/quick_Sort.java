package DZ.DZ4;

public class quick_Sort {
    public static void main(String[] args) {
        int[] arr = {10500, 56, 67, 34, 28, 5070, -13563, 169, -53};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void quickSort(int[] arr, int l, int r){
        if (l>=r) return;
        int pi = partition(arr, l, r);

        quickSort(arr, l, pi-1);
        quickSort(arr, pi+1, r);
    }

    private static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int pointer = l-1;
        for (int i = l; i<r; i++){
            if(arr[i] < pivot){
                pointer++;
                swap(pointer, i, arr);
            }
        }
        swap(pointer+1, r, arr);
        return pointer+1;
    }
    private static void swap(int pointer, int i, int[] arr){
        int temp = arr[pointer];
        arr[pointer] = arr[i];
        arr[i] = temp;
    }
}
