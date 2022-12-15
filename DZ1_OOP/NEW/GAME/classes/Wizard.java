package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Pair;
import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

public class Wizard extends BaseHero {

    public Wizard(Party side, int x, int y, int amount) {
        super(17, 12, 30, 9, 5, 5, 1, "Warlock", "alive");
        super.side = side;
        super.coords = new Vector2(x, y);
        super.initialAmount = amount;
    }

    private void Attack(Party foes) {
        Pair<BaseHero, Double> closedEnemyAndDistance = getClosedEnemyAndDistance(foes);
        closedEnemyAndDistance.getKey().getAttack(maxDmg);
    }

    private void Heal(Party party) {
        BaseHero lowestHpCharacter = party.get(0);
        for (BaseHero character : party) {
            if (character.currentHp < lowestHpCharacter.currentHp) {lowestHpCharacter = character;}
        }
        lowestHpCharacter.getHeal(maxDmg);
    }

    private void Resurrection(Party party) {
        BaseHero lowestAmountCharacter = party.get(0);
        for (BaseHero character : party) {
            if (character.currentAmount < lowestAmountCharacter.currentAmount) {lowestAmountCharacter = character;}
        }
        lowestAmountCharacter.currentAmount += 1;
        lowestAmountCharacter.currentHp = 1;
        lowestAmountCharacter.CheckStatus();
    }

    private void Assist(String className) {
        Party allOneClassHeroes = side.getHeroesByClass(className);
        Party wounded = new Party();
        Party dead = new Party();
        for (BaseHero character : allOneClassHeroes) {
            if (character.currentHp < character.maxHp*0.5) {wounded.add(character);}
            if (character.currentAmount < character.initialAmount) {dead.add(character);}
        }
        if (wounded.size() != 0) {Heal(wounded);}
        else if (dead.size() != 0) {Resurrection(dead);}
    }

    @Override
    public void step(Party enemies) {
        int initialWizardHP = side.getClassInitialHp("Wizard");
        int initialSharpshootersHP = side.getClassInitialHp("Sharpshooter");
        int initialRobberHp = side.getClassInitialHp("Robber");

        int currentWizardHP = side.getClassCurrentHp("Wizard");
        int currentSharpshootersHP = side.getClassCurrentHp("Sharpshooter");
        int currentRobberHP = side.getClassCurrentHp("Robber");

        if (currentWizardHP < initialWizardHP * 0.75) {
            Assist("Wizard");
        } else if (currentSharpshootersHP < initialSharpshootersHP * 0.75) {
            Assist("Sharpshooter");
        } else if (currentRobberHP < initialRobberHp * 0.75) {
            Assist("Robber");
        } else {
            Attack(enemies);
        }
    }
}
