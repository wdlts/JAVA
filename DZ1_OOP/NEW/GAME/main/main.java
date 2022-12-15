package DZ.DZ1_OOP.NEW.GAME.main;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.ConsoleView;
import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;
import DZ.DZ1_OOP.NEW.GAME.viewTurn.Turn;

import java.util.Scanner;

public class main {
    public static final int fieldSize = 10;
    public static Party darkside = new Party();
    public static Party lightside = new Party();

    public static void main(String[] args) {

        darkside.addWizard(1,1);
        darkside.addRobber(1,1);
        darkside.addRobber(1, 1);
        darkside.addPeasant(1, 1);
        darkside.addLancer(1, 1);
        lightside.addLancer(1,1);
        lightside.addLancer(1,1);
        lightside.addSharpshooter(1,1);


        while (true){

            Scanner sc = new Scanner(System.in);
            ConsoleView.view();
            System.out.println("                                            NEXT TURN - PRESS ENTER");
            Turn.Turn();
            sc.nextLine();
        }
    }
}

