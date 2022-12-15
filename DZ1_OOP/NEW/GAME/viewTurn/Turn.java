package DZ.DZ1_OOP.NEW.GAME.viewTurn;

import DZ.DZ1_OOP.NEW.GAME.classes.*;
import DZ.DZ1_OOP.NEW.GAME.main.main;

public class Turn {
    public static void Turn() {

        for (BaseHero character : main.darkside
                .getHeroesByClass("Robber")
                .getAliveHeroes()) {
            character.step(main.lightside);
        }
        for (BaseHero character : main.lightside
                .getHeroesByClass("Lancer")
                .getAliveHeroes()) {
            character.step(main.darkside);
        }
        for (BaseHero character : main.darkside
                .getHeroesByClass("Sharpshooter")
                .getAliveHeroes()) {
            character.step(main.lightside);
        }
        for (BaseHero character : main.lightside
                .getHeroesByClass("Arbalester")
                .getAliveHeroes()) {
            character.step(main.darkside);
        }
        for (BaseHero character : main.darkside
                .getHeroesByClass("Wizard")
                .getAliveHeroes()) {
            character.step(main.lightside);
        }
        for (BaseHero character : main.lightside
                .getHeroesByClass("Monk")
                .getAliveHeroes()) {
            character.step(main.darkside);
        }
        for (BaseHero character : main.darkside
                .getHeroesByClass("Peasant")
                .getAliveHeroes()) {
            character.step(main.lightside);
        }
        for (BaseHero character : main.lightside
                .getHeroesByClass("Peasant")
                .getAliveHeroes()) {
            character.step(main.darkside);
        }
    }
}
