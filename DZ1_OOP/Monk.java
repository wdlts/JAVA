package DZ.DZ1_OOP;

import java.util.ArrayList;
public class Monk extends BaseHero {
    public Monk(ArrayList<BaseHero> side) {
        super(12, 7, 0, new int[] {-4}, 30, 30,10,5, false, true);
        super.side = side;
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




