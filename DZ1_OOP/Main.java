package DZ.DZ1_OOP;

import java.util.ArrayList;

import static DZ.DZ1_OOP.GetName.getName;


public class Main {
    public static void main(String[] args) {

        ArrayList<Player> listPlayers = new ArrayList<>();
        listPlayers.add(new Arbalester(getName()));
        listPlayers.add(new Lancer(getName()));
        listPlayers.add(new Monk(getName()));
        listPlayers.add(new Peasant(getName()));
        listPlayers.add(new Robber(getName()));
        listPlayers.add(new Sharpshooter(getName()));
        listPlayers.add(new Wizard(getName()));

        listPlayers.forEach(System.out::println);
    }

}
