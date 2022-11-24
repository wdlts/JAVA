package DZ.DZ1_OOP;
import java.util.ArrayList;
import java.util.Arrays;
import static DZ.DZ1_OOP.GetName.getName;
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
                //"Shots = " + shots +" "+
                //"Damage = " + Arrays.toString(damage) +" "+
                //"maxHP = " + maxHP +" "+
                //"minHP = " + minHP +" "+
                //"Speed = " + speed +" "+
                //"Delivery = " + delivery +" "+
                //"Magic = " + magic +" "+
                "Name = " + name +" "+
                "Class = " + getClass().getSimpleName() +" "+
                "Health = " + health;

    }

    @Override
    public void Step(ArrayList<BaseHero> side){

    }

}


