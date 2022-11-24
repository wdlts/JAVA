package DZ.DZ1_OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<BaseHero> dark = new ArrayList<>();

        dark.add(new Robber(dark));
        dark.add(new Monk(dark));
        dark.add(new Peasant(dark));
        dark.add(new Sharpshooter(dark));
        dark.add(new Wizard(dark));
        dark.add(new Robber(dark));
        dark.add(new Monk(dark));
        dark.add(new Peasant(dark));
        dark.add(new Sharpshooter(dark));
        dark.add(new Wizard(dark));

        ArrayList<BaseHero> light = new ArrayList<>();

        light.add(new Monk(light));
        light.add(new Wizard(light));
        light.add(new Lancer(light));
        light.add(new Peasant(light));
        light.add(new Wizard(light));
        light.add(new Monk(light));
        light.add(new Wizard(light));
        light.add(new Lancer(light));
        light.add(new Arbalester(light));
        light.add(new Wizard(light));


        dark.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();
        light.forEach(n -> System.out.println(n.getInfo()));





    }

}
