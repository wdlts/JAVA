package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.HeroCLass.Statuses;
import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;
public class Peasant extends BaseHero {
    public Peasant(ArrayList<BaseHero> side, int x, int y) {
        super(1, 1, 0, new int[] {1,1}, 1,1,1, 3, true, false, Statuses.ALIVE);
        super.side = side;
        super.position = new Vector2(x,y);
        delivery = true;
    }

    @Override
    public void step(ArrayList<BaseHero> side) {
            if (getStatus().equals(Statuses.USED)){
                setStatus(Statuses.ALIVE);
            }
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}




