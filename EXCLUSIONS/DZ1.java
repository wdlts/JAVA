package DZ.EXCLUSIONS;

import java.util.Arrays;

public class DZ1 {

    public static void main(String[] args) throws Exception {
        arrayDiff();
        arrayDiff2();
        try {
            arrayDiff3(new int[]{1,2}, new int[]{4,5,6,7});
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void arrayDiff(){
        int[] result = new int[3];
        int[] arr1 = new int[]{1,2,3};
        int[] arr2 = new int[]{4,5};
        try{
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <3; j++) {
                    result[i] = arr1[i] - arr2[i];
                }
            }
            System.out.println(Arrays.toString(result));
        }catch (Exception e){
            System.out.println("Во время выполнения программы произошла ошибка! Программа будет выполнена с другими данными.");
        }
        finally {
            System.out.println("Выполняю программы.");
            arr2 = new int[]{4,5,50};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i] = arr1[i] - arr2[i];
                }
            }
            System.out.println(Arrays.toString(result));

        }
        System.out.println("Прогармма завершена.");
    }

    public static void arrayDiff2(){

        int[] result = new int[3];
        int[] arr1 = new int[]{1,2,3,6};
        int[] arr2 = new int[]{4,5};

        try {
            if (arr1.length != arr2.length){
                throw new Exception("Разные длины массивов! Используются другие данные!");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            arr1 = new int[]{1,2,3};
            arr2 = new int[]{4,5,6};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j <3; j++) {
                    result[i] = arr1[i] - arr2[i];
                }
            }
            System.out.println(Arrays.toString(result));
        }
    }

    public static void arrayDiff3(int[] arr1, int[] arr2) throws Exception{
        if (arr1[0] != arr2[0])
            throw new Exception("Значения в нулевых индексах должны совпадать!");
            int[] result = new int[3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result[i] = arr1[i] - arr2[i];
                }
            }
        System.out.println(Arrays.toString(result));
    }
}
