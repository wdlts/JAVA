package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;
public class Monk extends BaseHero {
    public Monk(ArrayList<BaseHero> side, int x, int y) {
        super(12, 7, 0, new int[] {-4}, 30, 30,10,5, false, true);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {
        for (BaseHero baseHero : side) {
            if (baseHero.health <= baseHero.minHP && baseHero.health !=0 && !baseHero.getClass().getSimpleName().equals("Peasant")) {
                baseHero.health = baseHero.health - damage[0];
            }
        }

    }
}




