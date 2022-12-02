package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;
public class Peasant extends BaseHero {
    public Peasant(ArrayList<BaseHero> side, int x, int y) {
        super(1, 1, 0, new int[] {1,1}, 1,1,1, 3, true, false);
        super.side = side;
        super.position = new Vector2(x,y);
    }

    @Override
    public void Step(ArrayList<BaseHero> side) {
            if (this.status.equals("Used")){
                this.status="Stand";
            }
    }
}




