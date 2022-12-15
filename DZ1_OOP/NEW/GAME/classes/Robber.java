package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Pair;
import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

import java.util.ArrayList;

public class Robber extends BaseHero {
    public Robber(Party side, int x, int y, int amount) {
        super(8, 3, 10, 6, 2, 4, 1 ,"Robber", "alive");
        super.side = side;
        super.coords = new Vector2(x, y);
        super.initialAmount = amount;
    }

    @Override
    public void step(Party enemies) {
        Pair <BaseHero, Double> ClosedEnemyAndDistance = getClosedEnemyAndDistance(enemies);
        BaseHero closedEnemy = ClosedEnemyAndDistance.getKey();

        ArrayList<Vector2> nearestLegalCells = new ArrayList<>();
        Party aliveAllies = this.side.getAliveHeroes();
        ArrayList<Vector2> aliveAlliesCoords = new ArrayList<>();
        for (BaseHero character : aliveAllies) {
            aliveAlliesCoords.add(character.coords);
        }

        final int[][] shifts = new int[][]{{-1, 1}, {0, 1}, {1, 1},{0, -1}, {1, 0}, {1, -1}, {1, -1}, {-1, 0}};
        for (int i = 0; i < 8; i++) {
            Vector2 currentCell = new Vector2(this.coords.x + shifts[i][0], this.coords.y + shifts[i][1]);
            if (currentCell.equals(closedEnemy.coords)) {
                ActionAttack(closedEnemy);
                return;
            }
            if (!aliveAlliesCoords.contains(currentCell)) {
                nearestLegalCells.add(currentCell);
            }
        }

        Vector2 cellWithMinDistance = nearestLegalCells.get(0);
        double localDistance = cellWithMinDistance.distance(closedEnemy.coords);
        for (Vector2 nearestLegalCell : nearestLegalCells) {
            double currentDistance = nearestLegalCell.distance(closedEnemy.coords);
            if (currentDistance < localDistance) {
                localDistance = currentDistance;
                cellWithMinDistance = nearestLegalCell;
            }
        }
        this.coords = cellWithMinDistance;
    }
}
