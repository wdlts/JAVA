package DZ.DZ1;

// Написать программу вычисления n-ого треугольного числа.
public class DZ_1_1 {
    public static void main(String[] args) {
        triangle(0, 1, 10);
    }

    static void triangle(int result, int next, int k) {
        while (next < k + 1) {
            result = result + next;
            next += 1;
            System.out.print(result + " ");
        }
    }
}
