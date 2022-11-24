package DZ.DZ1_OOP;

import java.util.ArrayList;
public class Wizard extends BaseHero {
    public Wizard (ArrayList<BaseHero> side) {
        super(17, 12, 0, new int[] {-5}, 30,30, 10, 9, false, true);
        super.side = side;
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}