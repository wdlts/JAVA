package DZ.DZ1_OOP.NEW.GAME.classes;

import DZ.DZ1_OOP.NEW.GAME.viewTurn.Party;

public interface BaseInterface {
    void step(Party party);
    String getInfo();
}
