package DZ.DZ1_OOP;

import java.util.ArrayList;
import static DZ.DZ1_OOP.GetName.getName;
public class Sharpshooter extends BaseHero {

    public Sharpshooter(ArrayList<BaseHero> side) {
        super(12, 10, 32, new int[] {8,10}, 15,15, 6, 9, false, false);
        super.side = side;
    }

    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}