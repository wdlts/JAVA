package DZ.DZ1_OOP.Chars;


import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;
public class Robber extends BaseHero {

    public Robber(ArrayList<BaseHero> side, int x, int y) {
        super(8, 3, 0, new int[] {2,4}, 10, 10, 4,6, false, false);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}




