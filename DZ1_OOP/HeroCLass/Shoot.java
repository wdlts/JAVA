package DZ.DZ1_OOP.HeroCLass;

import DZ.DZ1_OOP.Chars.BaseHero;

import java.util.ArrayList;

public abstract class Shoot extends BaseHero {
    int shot;

    public Shoot(int attack, int defence, int shots, int[] damage, int health, int maxHP, int minHP, int speed, boolean delivery, boolean magic, Statuses status) {
        super(attack, defence, shots, damage, health, maxHP, minHP, speed, delivery, magic, status);
        this.shots = shots;
    }

    private BaseHero getTarget (ArrayList<BaseHero> side){
        float minDistance = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < side.size(); i++) {
            if (side.get(i).getStatus() == Statuses.DEAD) continue;
            float distance = getPosition().getDistance(side.get(i).getPosition());
            if (minDistance > distance) {
                minDistance = distance;
                index = i;
            }
        }
        return side.get(index);
    }

    @Override
    public void step(ArrayList<BaseHero> side){
        if (getStatus() == Statuses.DEAD) return;
        for (int i = 0; i < getSide().size(); i++) {
            if (getSide().get(i).getClassName().equals("Peasant") && getSide().get(i).getStatus().equals(Statuses.ALIVE)){
                shots++;
                getSide().get(i).setStatus(Statuses.USED);
            }
        }
        if (shots <= 0) return;
        shots--;
        BaseHero target = getTarget(side);
        getAttack(target);
    }
}
