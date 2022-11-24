package DZ.DZ1_OOP;
import java.util.ArrayList;
public class Lancer extends BaseHero {

    public Lancer (ArrayList<BaseHero> side) {
        super(4, 5, 0, new int[] {1,5}, 10, 10, 4,4, false, false);
        super.side = side;
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {

    }
}