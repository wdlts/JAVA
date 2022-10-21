package DZ.DZ2;

/**
 * DZ_2_1
 */
public class DZ_2_1 {

    public static void main(String[] args) {
        hanoi(3, 1, 2);

    }

    public static void hanoi(int n, int i, int k) {
        if (n == 1) {
            System.out.printf("Move disc 1 from axle %d to axle %d.\n", i, k);
        } else {
            int tmp = 6 - i - k;
            hanoi(n - 1, i, tmp);
            System.out.printf("Move disc %d from axle %d to axle %d.\n", n, i, k);
            hanoi(n - 1, tmp, k);
        }

    }

}
