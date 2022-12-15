package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

public class Peasant extends BaseHero {
    private final int delivery = 1;

    public Peasant (Party side, int x, int y, int amount) {
        super(1, 1, 1, 3, 1, 1, 1,"Peasant", "alive");
        super.side = side;
        super.coords = new Vector2(x, y);
        super.initialAmount = amount;
    }

    @Override
    public void step(Party enemies) {
        if (!this.status.equals("dead")) {
            this.status = "alive";
        }
    }
}
