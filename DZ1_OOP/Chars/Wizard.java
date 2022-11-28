package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;
public class Wizard extends BaseHero {
    public Wizard (ArrayList<BaseHero> side, int x, int y) {
        super(17, 12, 0, new int[] {-5}, 30,30, 10, 9, false, true);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}