package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;

public class Arbalester extends BaseHero {

    public Arbalester (ArrayList<BaseHero> side, int x, int y) {
        super(6, 3, 16, new int[] {2,3}, 10, 10, 4,4, false, false);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }

}