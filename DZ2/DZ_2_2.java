package DZ.DZ2;

import java.util.Arrays;

public class DZ_2_2 {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 26, 53, 756, 23, 44, 1, 2 };
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;

        }
    }
}