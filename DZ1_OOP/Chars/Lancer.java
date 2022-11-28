package DZ.DZ1_OOP.Chars;
import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;
public class Lancer extends BaseHero {

    public Lancer (ArrayList<BaseHero> side, int x, int y) {
        super(4, 5, 0, new int[] {1,5}, 10, 10, 4,4, false, false);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}