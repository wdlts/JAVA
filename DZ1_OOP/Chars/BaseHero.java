package DZ.DZ1_OOP.Chars;
import DZ.DZ1_OOP.Vector2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static DZ.DZ1_OOP.Chars.GetName.getName;

public abstract class BaseHero implements BaseInterface {
        int attack;
        int defence;
        int shots;
        int[] damage;
        int health;
        int maxHP;
        int minHP;
        int speed;
        boolean delivery;
        boolean magic;
        String name;
        protected ArrayList<BaseHero> side;
        protected Vector2 position;
        protected String status;



    public BaseHero(int attack, int defence, int shots, int[] damage, int health, int maxHP,
                    int minHP, int speed, boolean delivery, boolean magic) {
        this.attack = attack;
        this.defence = defence;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.maxHP = maxHP;
        this.minHP = minHP;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
        this.name = getName();
        this.status = "alive";

    }

    public Vector2 getPosition () {
        return position;
    }
    @Override
    public String toString() {
        return "Attack = " + attack +" "+
                "Defence = " + defence +" "+
                "Shots = " + shots +" "+
                "Damage = " + Arrays.toString(damage) +" "+
                "maxHP = " + maxHP +" "+
                "minHP = " + minHP +" "+
                "Speed = " + speed +" "+
                "Delivery = " + delivery +" "+
                "Magic = " + magic +" "+
                "Name = " + name +" "+
                "Class = " + getClass().getSimpleName() +" "+
                "Health = " + health;

    }

    @Override
    public String getInfo(){
        return //"Attack = " + attack +" "+
                //"Defence = " + defence +" "+
                "Shots = " + shots +" "+
                //"Damage = " + Arrays.toString(damage) +" "+
                //"maxHP = " + maxHP +" "+
                //"minHP = " + minHP +" "+
                //"Speed = " + speed +" "+
                //"Delivery = " + delivery +" "+
                //"Magic = " + magic +" "+
                name +" "+
                getClass().getSimpleName() +" "+
                "Health = " + health+" "+
                "Status = " + status;

    }


    @Override
    public void Step(ArrayList<BaseHero> side){
    }


    public double distance (BaseHero h){
        return Math.sqrt((h.getPosition().x - this.position.x)^2 + (h.getPosition().y - this.position.y)^2);
    }

    public int[] getDamage(){return damage;}

    public void damage(int damage){
        this.health = health-damage;
        if (this.health<= 0){
            this.health = 0;
            this.status = "dead";
        }
    }

    protected int damageCalc (BaseHero h){
        int value = 0;
        int flg = this.attack - h.defence;
        if (flg == 0) value = ((this.damage[0] + this.damage[1])/2);
        if (flg > 0) value = this.damage[1];
        if (flg < 0) value = this.damage[0];
        return value;
    }
}


