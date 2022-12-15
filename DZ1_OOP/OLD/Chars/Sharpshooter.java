package DZ.DZ1_OOP.OLD.Chars;

import DZ.DZ1_OOP.OLD.HeroCLass.Shoot;
import DZ.DZ1_OOP.OLD.HeroCLass.Statuses;
import DZ.DZ1_OOP.OLD.Vector2;

import java.util.ArrayList;

public class Sharpshooter extends Shoot {

    public Sharpshooter(ArrayList<BaseHero> side, int x, int y) {
        super(12, 10, 32, new int[] {8,10}, 15,15, 6, 9, false, false, Statuses.ALIVE);
        super.side = side;
        super.position = new Vector2(x,y);
    }

    @Override
    public void step(ArrayList<BaseHero> side) {
        if (this.shots>0) this.shots--;
        for (BaseHero hero : side){
            if (hero.getClassName().equals("Peasant") && hero.getStatus().equals(Statuses.STAND)){
                this.shots++;
                hero.status = Statuses.USED;
                break;
            }
        }

        if (this.shots<1) return;
        double closest = this.distance(side.get(0));
        int closestIndex = 0;
        for (int i = 1; i < side.size(); i++) {
            if (this.distance(side.get(i)) < closest && side.get(i).getStatus().equals(Statuses.ALIVE)) {
                closest = this.distance(side.get(i));
                closestIndex = i;
            }
            side.get(closestIndex).damage(closest > this.speed ? super.damageCalc(side.get(closestIndex))
                    : (super.damageCalc(side.get(closestIndex))/2));
            this.shots--;
        }
    }
    @Override
    public String getInfo() {return super.getInfo();}
}