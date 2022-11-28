package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;

public class Sharpshooter extends BaseHero {

    public Sharpshooter(ArrayList<BaseHero> side, int x, int y) {
        super(12, 10, 32, new int[] {8,10}, 15,15, 6, 9, false, false);
        super.side = side;
        super.position = new Vector2(x,y);
    }

    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}