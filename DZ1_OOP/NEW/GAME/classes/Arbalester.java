package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Pair;
import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

public class Arbalester extends BaseHero {
    private int shots = 16;

    public Arbalester(Party side, int x, int y, int amount) {
        super(6, 3, 11, 4, 2, 3, 1,"Xbowman", "alive");
        super.side = side;
        super.coords = new Vector2(x, y);
        super.initialAmount = amount;
    }

    private void ActionAttack(BaseHero target, double distance) {
        int damage = DamageCalc(target);
        damage = distance < initiative ? damage : damage/2;
        target.getAttack(damage);
    }

    @Override
    public void step(Party enemies) {
        for (int i = 0; i < 2; i++) {
            for (BaseHero character : side) {
                if (character.className.equals("peasant") && character.status.equals("alive")) {
                    shots++;
                    character.status = "stand";
                    break;
                }
            }
            if (shots != 0) {
                Pair<BaseHero, Double> closedEnemyAndDistance = getClosedEnemyAndDistance(enemies);
                shots--;
                ActionAttack(closedEnemyAndDistance.getKey(), closedEnemyAndDistance.getValue());
            }
        }
    }
}
