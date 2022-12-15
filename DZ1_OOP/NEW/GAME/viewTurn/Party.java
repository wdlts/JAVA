package DZ.DZ1_OOP.NEW.GAME.viewTurn;

import DZ.DZ1_OOP.NEW.GAME.classes.*;
import DZ.DZ1_OOP.NEW.GAME.main.main;

import java.util.ArrayList;

public class Party extends ArrayList<BaseHero> {
    public Party() {}

    public Party(Party party1, Party party2) {
        this.addAll(party1);
        this.addAll(party2);
    }
    @Override
    public String toString() {
        StringBuilder resString = new StringBuilder();
        for (BaseHero character : this) {
            resString.append(character.getInfo())
                    .append("\n");
        }
        return resString.toString();
    }

    public Party getAliveHeroes() {
        Party aliveHeroes = new Party();
        for (BaseHero character : this) {
            if (!character.getStatus().equals("dead")) {
                aliveHeroes.add(character);
            }
        }
        return aliveHeroes;
    }

    public Party getDeadHeroes() {
        Party deadHeroes = new Party();
        for (BaseHero character : this) {
            if (character.getStatus().equals("dead")) {
                deadHeroes.add(character);
            }
        }
        return deadHeroes;
    }

    public Party getHeroesByClass(String heroClass) {
        Party oneClassHeroes = new Party();
        for (BaseHero character : this) {
            if (character.getClassName().equals(heroClass)) {
                oneClassHeroes.add(character);
            }
        }
        return oneClassHeroes;
    }

    public int getClassInitialHp(String heroClass) {
        int initialClassHp = 0;
        for (BaseHero character : this) {
            if (character.getClassName().equals(heroClass)) {
                initialClassHp += character.getInitialStackHp();
            }
        }
        return initialClassHp;
    }

    public int getClassCurrentHp(String heroClass) {
        int currentClassHp = 0;
        for (BaseHero character : this) {
            if (character.getClassName().equals(heroClass)) {
                currentClassHp += character.getCurrentStackHp();
            }
        }
        return currentClassHp;
    }

    public void addPeasant(int peasants, int amount) {
        for (int i = 0; i < peasants; i++) {
            int x = (this == main.darkside) ? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Peasant(this, x, y, amount));
        }
    }
    public void addRobber(int robbers, int amount) {
        for (int i = 0; i < robbers; i++) {
            int x = (this == main.darkside) ? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Robber(this, x, y, amount));
        }
    }
    public void addSharpshooter(int sharpshooters, int amount) {
        for (int i = 0; i < sharpshooters; i++) {
            int x = (this == main.darkside)? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Sharpshooter(this, x, y, amount));
        }
    }
    public void addWizard(int wizards, int amount) {
        for (int i = 0; i < wizards; i++) {
            int x = (this == main.darkside) ? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Wizard(this, x, y, amount));
        }
    }
    public void addMonk(int monks, int amount) {
        for (int i = 0; i < monks; i++) {
            int x = (this == main.darkside) ? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Monk(this, x, y, amount));
        }
    }
    public void addLancer(int lancer, int amount) {
        for (int i = 0; i < lancer; i++) {
            int x = (this == main.darkside) ? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Lancer(this, x, y, amount));
        }
    }
    public void addArbalester(int arbalesters, int amount) {
        for (int i = 0; i < arbalesters; i++) {
            int x = (this == main.darkside) ? 0 : main.fieldSize-1;
            int y = this.size();
            this.add(new Arbalester(this, x, y, amount));
        }
    }
}
