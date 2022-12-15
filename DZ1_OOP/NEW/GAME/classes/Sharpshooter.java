package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Pair;
import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

public class Sharpshooter extends BaseHero {
    private int shots = 32;

    public Sharpshooter(Party side, int x, int y, int amount) {
        super(12, 10, 15, 9, 8, 10, 1,"Sharpshooter", "alive");
        super.side = side;
        super.coords = new Vector2(x, y);
        super.initialAmount = amount;
    }

    @Override
    public void step(Party enemies) {
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
            ActionAttack(closedEnemyAndDistance.getKey());
        }
    }
}
