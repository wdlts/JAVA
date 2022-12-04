package DZ.DZ1_OOP;
import DZ.DZ1_OOP.Chars.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static int SIDE_SIZE = 10;
    public static ArrayList<BaseHero> cyan;
    public static ArrayList<BaseHero> green;
    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);

        while (true){
            ConsoleView.view();
            System.out.println("Press ENTER");
            scanner.nextLine();
            green.forEach(n->n.step(cyan));
            cyan.forEach(n->n.step(green));
        }
    }
    private static void init (){
        cyan = new ArrayList<>();
        green = new ArrayList<>();
        int x = 1;
        int y = 1;
        for (int i = 0; i <SIDE_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> cyan.add(new Peasant(cyan, x++, y));
                case 1 -> cyan.add(new Robber(cyan, x++, y));
                case 2 -> cyan.add(new Sharpshooter(cyan, x++, y));
                default -> cyan.add(new Monk(cyan, x++, y));
            }
        }
        x=1;
        y=10;
        for (int i = 0; i < SIDE_SIZE; i++) {
            switch (new Random().nextInt(4)) {
                case 0 -> green.add(new Peasant(green, x++, y));
                case 1 -> green.add(new Lancer(green, x++, y));
                case 2 -> green.add(new Arbalester(green, x++, y));
                default -> green.add(new Wizard(green, x++, y));
            }
        }
    }
}
