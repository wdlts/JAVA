package DZ.DZ1_OOP;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Player {
        int attack;
        int defence;
        int shots;
        int[] damage;
        int health;
        int speed;
        boolean delivery;
        boolean magic;
        String name;

    public Player(int attack, int defence, int shots, int[] damage, int health, int speed, boolean delivery, boolean magic, String name) {
        this.attack = attack;
        this.defence = defence;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Attack = " + attack +" "+
                "Defence = " + defence +" "+
                "Shots = " + shots +" "+
                "Damage = " + Arrays.toString(damage) +" "+
                "Health = " + health +" "+
                "Speed = " + speed +" "+
                "Delivery = " + delivery +" "+
                "Magic = " + magic +" "+
                "Name = " + name;
    }





}


