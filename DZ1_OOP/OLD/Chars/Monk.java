package DZ.DZ1_OOP.OLD.Chars;

import DZ.DZ1_OOP.OLD.HeroCLass.Heal;
import DZ.DZ1_OOP.OLD.HeroCLass.Statuses;
import DZ.DZ1_OOP.OLD.Vector2;

import java.util.ArrayList;
public class Monk extends Heal {
    public Monk(ArrayList<BaseHero> side, int x, int y) {
        super(12, 7, 0, new int[] {-4}, 30, 30,10,5, false, true, Statuses.ALIVE);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void step(ArrayList<BaseHero> side) {
        for (BaseHero baseHero : side) {
//            if (baseHero.health <= baseHero.minHP && baseHero.health !=0 && !baseHero.getClass().getSimpleName().equals("Peasant")) {
//                baseHero.health = baseHero.health - baseHero.damage[0];
//            }
            if (baseHero.health < baseHero.maxHP*0.75){
                baseHero.health = baseHero.health - this.getDamage()[0];{
                    if (baseHero.health>baseHero.maxHP){
                        baseHero.health=baseHero.maxHP;
                    }
                }
            }
            if (baseHero.getStatus().equals(Statuses.DEAD) && baseHero.side.equals(this.side)) {
                baseHero.status=Statuses.ALIVE;
                baseHero.health = 1;
            }
//          if (baseHero.health > baseHero.getHealth()*0.75 && baseHero.side != this.side) {
//              baseHero.health = baseHero.health - baseHero.damage[0];
//          }

        }

    }
    @Override
    public String getInfo() {return super.getInfo();}

}




