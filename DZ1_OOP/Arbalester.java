package DZ.DZ1_OOP;

import java.util.ArrayList;
import java.util.Arrays;

public class Arbalester extends BaseHero {

    public Arbalester (ArrayList<BaseHero> side) {
        super(6, 3, 16, new int[] {2,3}, 10, 10, 4,4, false, false);
        super.side = side;
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }

}