package DZ.DZ1_OOP.HeroCLass;

import DZ.DZ1_OOP.Chars.BaseHero;
import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;

public abstract class Melee extends BaseHero {

    public Melee(int attack, int defence, int shots, int[] damage, int health, int maxHP, int minHP, int speed, boolean delivery, boolean magic, Statuses status) {
        super(attack, defence, shots, damage, health, maxHP, minHP, speed, delivery, magic, status);
    }

    private BaseHero getTarget(ArrayList<BaseHero> side) {
        float minDistance = Float.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < side.size(); i++) {
            if (side.get(i).getStatus().equals(Statuses.DEAD)) continue;
            float distance = getPosition().getDistance(side.get(i).getPosition());
            if (minDistance > distance) {
                minDistance = distance;
                index = i;
            }
        }
        return side.get(index);
    }

    @Override
    public void step(ArrayList<BaseHero> group) {
        if (getStatus().equals(Statuses.DEAD)) return;
        BaseHero target = getTarget(group);
        if (getPosition().getDistance(target.getPosition()) < Math.sqrt(2))
            getAttack(target);
        int x = getPosition().x;
        int y = getPosition().y;
        if (target.getPosition().y > y && checkPos(new Vector2(x, y + 1)))
            setPosition(new Vector2(x, y + 1));
        else if (target.getPosition().y < y && checkPos(new Vector2(x, y - 1)))
            setPosition(new Vector2(x, y - 1));
        else if (target.getPosition().x > x && checkPos(new Vector2(x + 1, y)))
            setPosition(new Vector2(x + 1, y));
        else if (target.getPosition().x > x && checkPos(new Vector2(x - 1, y)))
            setPosition(new Vector2(x - 1, y));
    }

    private boolean checkPos(Vector2 pos) {
        for (BaseHero hero : getSide()) {
            if (pos.equals(hero.getPosition()))
                return false;
        }
        return true;
    }
}
