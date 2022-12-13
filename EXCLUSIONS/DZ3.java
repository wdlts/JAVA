package DZ.EXCLUSIONS;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DZ3 {

    public static void main(String[] args) throws Exception {
        userData();
    }
    public static void userData () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите через пробел Фамилию, Имя, Отчество, Дату рождения(дд.мм.гггг), Пол(f/m), Телефон(только цифры) ");
        String uData = sc.nextLine();
        String[] outData = uData.split(" ");
        int dataCount = 6;
        boolean flag = false;
            try {
                if (outData.length < dataCount) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Введено недостаточно данных");
            }
            try {
                if (outData.length > dataCount) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Введено слишком много данных");
            }
            try {
                if (outData[0].matches("^[0-9]*$")) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("В фамилию введены неверные данные");
            }
            try {
                if (outData[1].matches("^[0-9]*$")) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("В имя введены неверные данные");
            }
            try {
                if (outData[2].matches("^[0-9]*$")) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("В отчество введены неверные данные");
            }
            try {
                if (outData[3].matches("^[a-zA-Zа-яА-Я]*$")) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Дата рождения введена неверно");
            }
            try {
                if (!outData[4].equals("f") && !outData[5].equals("m")) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Пол указан неверно");
            }
            try {
                if (!outData[5].matches("^[0-9]*$")) {
                    flag = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Телефон введен неверно");
            }
            if(!flag){
                try (FileWriter writer = new FileWriter(outData[0] + ".txt", true)) {
                    writer.write(uData);
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
     }
}
