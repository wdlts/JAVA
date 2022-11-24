package DZ.DZ1_OOP;

import java.util.ArrayList;
public class Peasant extends BaseHero {
    public Peasant(ArrayList<BaseHero> side) {
        super(1, 1, 0, new int[] {1,1}, 1,1,1, 3, true, false);
        super.side = side;
    }

    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}




