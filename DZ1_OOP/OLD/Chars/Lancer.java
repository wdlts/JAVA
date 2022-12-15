package DZ.DZ1_OOP.OLD.Chars;
import DZ.DZ1_OOP.OLD.HeroCLass.Melee;
import DZ.DZ1_OOP.OLD.HeroCLass.Statuses;
import DZ.DZ1_OOP.OLD.Vector2;

import java.util.ArrayList;
public class Lancer extends Melee {

    boolean delivery;
    public Lancer (ArrayList<BaseHero> side, int x, int y) {
        super(4, 5, 0, new int[] {1,5}, 10, 10, 4,4, false, false, Statuses.ALIVE);
        super.side = side;
        super.position = new Vector2(x,y);
        delivery = false;
    }
//    @Override
//    public void step(ArrayList<BaseHero> side) {
//        for (BaseHero baseHero : side) {
//            if (baseHero.health <= baseHero.maxHP) {
//                baseHero.health = baseHero.health - baseHero.damage[0];
//            }
//        }
//    }

    @Override
    public String getInfo() {return super.getInfo();}

}