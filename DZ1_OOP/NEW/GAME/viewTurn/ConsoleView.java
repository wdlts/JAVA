package DZ.DZ1_OOP.NEW.GAME.viewTurn;

import DZ.DZ1_OOP.NEW.GAME.classes.BaseHero;
import DZ.DZ1_OOP.NEW.GAME.classes.Vector2;
import DZ.DZ1_OOP.NEW.GAME.main.main;

import java.util.Collections;

public class ConsoleView {
    private static final String top = String.join("", Collections.nCopies(22, " ")) +
            "GREEN:   " +
            String.join("", Collections.nCopies(14, " "))  +
            "\u250c" +
            String.join("", Collections.nCopies(main.fieldSize-1, "\u2500\u252c")) +
            "\u2500\u2510" +
            String.join("", Collections.nCopies(14, " ")) +
            "CYAN:" +
            String.join("", Collections.nCopies(14, " "));
    private static final String mid = String.join("", Collections.nCopies(45, " ")) +
            "\u251c" +
            String.join("", Collections.nCopies(main.fieldSize-1, "\u2500\u253c")) +
            "\u2500\u2524";
    private static final String bot = String.join("", Collections.nCopies(45, " ")) +
            "\u2514" +
            String.join("", Collections.nCopies(main.fieldSize-1, "\u2500\u2534")) +
            "\u2500\u2518";
    private static final Party allHeroes = new Party(main.lightside, main.darkside);

    public static void view() {
        System.out.println(top);
        for (int i = 0; i < main.fieldSize; i++) {
            LineBuilder(i);
            if (i < main.fieldSize - 1) {
                System.out.println(mid);
            }
        }
        System.out.println(bot);
    }

    private static void LineBuilder(int i) {
        StringBuilder currentCharInfo = new StringBuilder(String.join("",  Collections.nCopies(45, " ")));
        try {
            String infoDarkside = main.darkside.get(i).getInfo();
            currentCharInfo.replace(0, infoDarkside.length(), infoDarkside);
        } catch (IndexOutOfBoundsException ignored) {}
        for (int j = 0; j < main.fieldSize+1; j++) {
            currentCharInfo.append(getChar(new Vector2(j, i)));
        }
        try {
            String infoLightside = main.lightside.get(i).getInfo();
            currentCharInfo.append(" ").append(infoLightside);
        } catch (IndexOutOfBoundsException ignored) {}
        System.out.println(currentCharInfo);
    }

    private static String getChar(Vector2 position) {
        String str = "| ";
        for (BaseHero character : allHeroes.getDeadHeroes()) {
            if(character.getCoords().equals(position)) {
                str = "|" + Colors.RED + character.getClassName().charAt(0) + Colors.RESET;
            }
        }
        for (BaseHero character : allHeroes.getAliveHeroes()) {
            if(character.getCoords().equals(position)) {
                if (character.getSide().equals(main.darkside)) {
                    str = "|" + Colors.GREEN + character.getClassName().charAt(0) + Colors.RESET;
                } else {
                    str = "|" + Colors.CYAN + character.getClassName().charAt(0) + Colors.RESET;
                }
            }
        }
        return str;
    }
}
