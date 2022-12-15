package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

public class Monk extends BaseHero {

    public Monk(Party side, int x, int y, int amount) {
        super(12, 7, 30, 5, -4, -4, 1,"Monk", "alive");
        super.side = side;
        super.coords = new Vector2(x, y);
        super.initialAmount = amount;
    }

    @Override
    public void step(Party enemies) {
        Party aliveAllies = side.getAliveHeroes();
        BaseHero lowestHpCharacter = aliveAllies.get(0);
        for (BaseHero character : aliveAllies) {
            if (character.currentHp < lowestHpCharacter.currentHp) {
                lowestHpCharacter = character;
            }
        }
        ActionAttack(lowestHpCharacter);
        if (lowestHpCharacter.currentHp > lowestHpCharacter.maxHp) {
            lowestHpCharacter.currentHp = lowestHpCharacter.maxHp;
        }
    }
}
