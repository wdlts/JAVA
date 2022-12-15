package DZ.DZ1_OOP.OLD.Chars;
import DZ.DZ1_OOP.OLD.AnsiColors;
import DZ.DZ1_OOP.OLD.HeroCLass.Statuses;
import DZ.DZ1_OOP.OLD.Vector2;
import java.util.ArrayList;
import java.util.Arrays;

import static DZ.DZ1_OOP.OLD.Chars.GetName.getName;

public abstract class BaseHero implements BaseInterface {
        int attack;
        int defence;
        protected int shots;
        int[] damage;
        int health;
        int maxHP;
        int minHP;
        protected int speed;
        boolean delivery;
        protected boolean magic;
        String name;
        protected ArrayList<BaseHero> side;
        protected Vector2 position;
        Statuses status;

    public BaseHero(int attack, int defence, int shots, int[] damage, int health, int maxHP,
                    int minHP, int speed, boolean delivery, boolean magic, Statuses status) {
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
        this.status = status;


    }

    public void setStatus(Statuses status){
        this.status = status;
    }
    public Statuses getStatus(){
        return this.status;
    }
    public Vector2 getPosition () {
        return position;
    }
    public void setPosition(Vector2 position) {
        this.position = position;
    }
    public ArrayList<BaseHero> getSide(){
        return side;
    }
    public int getHealth(){
        return health;
    }
    public int getMaxHP(){
        return maxHP;
    }
    public void setHP(int health){
        if (health > getMaxHP()) this.health = maxHP;
        else this.health = health;
    }
    private String getHeroName(){
        return this.name;
    }
    public int[] getDamage(){return damage;}
    public String getClassName () {
        return getClass().getSimpleName();
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
                "Class = " + getClassName()+" "+
                "Health = " + health;

    }

    @Override
    public String getInfo(){
        String str = status +"";
        String str2 = health +"";
        if (status.equals(Statuses.DEAD)) str = AnsiColors.ANSI_RED+ getStatus() + AnsiColors.ANSI_RESET;
        if (maxHP - health != 0) str2 = AnsiColors.ANSI_GREEN + health + AnsiColors.ANSI_RESET;
        return name+" " + getClassName()+ " HP "  + str2 + " " + str ;


    }


    protected void getAttack(BaseHero hero) {
        if (attack == hero.defence && speed < position.getDistance(hero.getPosition()))
            hero.health -= (damage[0] + damage[1]) / 4;
        if (attack == hero.defence) hero.health -= (damage[0] + damage[1]) / 2;
        if (attack > hero.defence && speed < position.getDistance(hero.getPosition())) hero.health -= damage[1] / 2;
        if (attack > hero.defence) hero.health -= damage[1];
        if (attack < hero.defence && speed < position.getDistance(hero.getPosition())) hero.health -= damage[0] / 2;
        else hero.health -= damage[0];
        if (hero.health <= 0) {
            hero.health = 0;
            hero.setStatus(Statuses.DEAD);
        }
    }
        public double distance (BaseHero h){
            return Math.sqrt((h.getPosition().x - this.position.x) ^ 2 + (h.getPosition().y - this.position.y) ^ 2);
        }
        public void damage (int damage){
            this.health = health - damage;
            if (this.health <= 0) {
                this.health = 0;
                this.status = Statuses.DEAD;
            }
        }
        protected int damageCalc (BaseHero h){
            int value = 0;
            if (attack - h.defence > 0) {value = damage[1];}
            else if (attack - h.defence < 0) {value = damage[0];}
            else {value = (damage[1] + damage[0]) / 2;}
            return value * this.health;
        }

    public abstract void step(ArrayList<BaseHero> side);
}



