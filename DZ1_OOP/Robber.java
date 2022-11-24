package DZ.DZ1_OOP;
import java.util.ArrayList;
public class Robber extends BaseHero {

    public Robber(ArrayList<BaseHero> side) {
        super(8, 3, 0, new int[] {2,4}, 10, 10, 4,6, false, false);
        super.side = side;
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}




