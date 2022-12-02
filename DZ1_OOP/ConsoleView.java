package DZ.DZ1_OOP;

import java.util.Collections;
public class ConsoleView {
    public static int step = 0;
    public static final String top10 = formatDiv("a") + String.join("", Collections.nCopies(9,formatDiv("-b"))) + formatDiv("-c");
    public static final String mid10 = formatDiv("d") + String.join("", Collections.nCopies(9,formatDiv("-e"))) + formatDiv("f");
    public static final String bottom10 = formatDiv("g") + String.join("", Collections.nCopies(9,formatDiv("h"))) + formatDiv("i");

    public static void view(){
        if(step++ == 0) {
            System.out.println(AnsiColors.ANSI_RED + "Step: 1" + AnsiColors.ANSI_RESET);
        }
        else {
            System.out.println(AnsiColors.ANSI_RED + "Step: " + step + AnsiColors.ANSI_RESET);
        }
        System.out.println(ConsoleView.top10);
        for (int i = 1; i <= Main.SIDE_SIZE-1; i++) {
            for (int j = 1; j <= Main.SIDE_SIZE; j++) {
                System.out.print(getChar(new Vector2(i,j)));
            }
            System.out.println("|");
            System.out.println(ConsoleView.mid10);
        }
        for (int j = 1; j <= Main.SIDE_SIZE; j++) {
            System.out.print(getChar(new Vector2(10, j)));
        }
        System.out.println("|");
        System.out.println(ConsoleView.bottom10);
    }
    private static String getChar(Vector2 position){
        String str = "| ";
        for (int i = 0; i < Main.SIDE_SIZE; i++) {
            if (Main.green.get(i).getPosition().isEqual(position)) str = "|" + AnsiColors
                    .ANSI_GREEN+Main.green.get(i)
                    .getClass().getSimpleName()
                    .charAt(0)+AnsiColors.ANSI_RESET+"|"+AnsiColors
                    .ANSI_CYAN+(Main.cyan.get(i).getInfo())+AnsiColors
                    .ANSI_RESET + " | " +AnsiColors.ANSI_GREEN+(Main.green.get(i)
                    .getInfo())+AnsiColors.ANSI_RESET;
            if (Main.cyan.get(i).getPosition().isEqual(position)) str = "|" + AnsiColors.ANSI_CYAN+Main.cyan.get(i)
                    .getClass().getSimpleName().charAt(0)+AnsiColors.ANSI_RESET;
        }
        return str;
    }
    private static String formatDiv(String s){
        return s.replace('a', 'Г')
                .replace('b', 'Т')
                .replace("c", "|")
                .replace("d", "|")
                .replace('e', '+')
                .replace("f", "-|")
                .replace("g", "L")
                .replace("h", "_|")
                .replace("i", "_|")
                .replace('-', ' ')
                .replace("s", "...")
                .replace("o", "___");
//        str.replace('a', '\u250c')
//                .replace('b', '\u252c')
//                .replace('c', '\u2510')
//                .replace('d', '\u251c')
//                .replace('e', '\u253c')
//                .replace('f', '\u2524')
//                .replace('g', '\u2514')
//                .replace('h', '\u2534')
//                .replace('i', '\u2518')
//                .replace('-', '\u2500')
//                .replace("s", "...")
//                .replace("o", "___");


    }
}
