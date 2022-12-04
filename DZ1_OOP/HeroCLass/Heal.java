package DZ.DZ1_OOP.HeroCLass;

import DZ.DZ1_OOP.Chars.BaseHero;

import java.util.ArrayList;

public abstract class Heal extends BaseHero {


    public Heal(int attack, int defence, int shots, int[] damage, int health, int maxHP, int minHP, int speed, boolean delivery, boolean magic, Statuses alive) {
        super(attack, defence, shots, damage, health, maxHP, minHP, speed, delivery, magic, Statuses.ALIVE);
        this.magic = true;
    }

    @Override
    public String getInfo(){
        return super.getInfo();
    }


    @Override
    public void step(ArrayList<BaseHero> side){
        if (getStatus() == Statuses.DEAD) return;
        double minHealth = Double.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < side.size(); i++) {
            if (side.get(i).getStatus() != Statuses.DEAD && getSide().get(i).getMaxHP() - getSide().get(i).getHealth() !=0){
                if (minHealth > getSide().get(i).getMaxHP() - getSide().get(i).getHealth()){
                    minHealth = getSide().get(i).getMaxHP() - getSide().get(i).getHealth();
                    index = i;
                }
            }

        }
        if (minHealth != Double.MAX_VALUE){
            getSide().get(index).setHP(getHealth()-getDamage()[0]);
        }

    }



}
