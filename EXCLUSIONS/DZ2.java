package DZ.EXCLUSIONS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DZ2 {

    public static void main(String[] args) {
        Exception1();
        Exception2();
        Exception3();
        Exception4();
    }

    public static void Exception1(){
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Input num a: ");
            try {
                float a = in.nextFloat();
                System.out.println(a);
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Wrong input, try again!");
            }
        }
    }

    public static void Exception2(){
        try {
            int d = 0;
            int[] intArray= new int[]{1,2,3,4,5,6,7,8,9};
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }


    public static void Exception3() {
        printSum(23, 234);
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex){
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

    public static void Exception4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input string: ");
        try {
            String a = in.nextLine();
            System.out.println(a);
            if (a.isEmpty()){
                throw new Exception();
            }
        }
        catch (Exception nullEx){
            System.out.println("No EMPTY string allowed!");
        }
    }
}
