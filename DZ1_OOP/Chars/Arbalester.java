package DZ.DZ1_OOP.Chars;

import DZ.DZ1_OOP.Vector2;

import java.util.ArrayList;

public class Arbalester extends BaseHero {

    public Arbalester (ArrayList<BaseHero> side, int x, int y) {
        super(6, 3, 16, new int[] {2,3}, 10, 10, 4,4, false, false);
        super.side = side;
        super.position = new Vector2(x,y);
    }
    @Override
    public void Step(ArrayList<BaseHero> side) {
        if (this.shots>0) this.shots--;
        for (BaseHero hero : side){
            if (hero.getClass().getSimpleName().equals("Peasant") && hero.status.equals("Stand")){
                this.shots++;
                hero.status = "Used";
                break;
            }
        }

        if (this.shots<1) return;
        double closest = this.distance(side.get(0));
        int closestIndex = 0;
        for (int i = 1; i < side.size(); i++) {
            if (this.distance(side.get(i)) < closest && side.get(i).status.equals("alive")) {
                closest = this.distance(side.get(i));
                closestIndex = i;
            }

            side.get(closestIndex).damage(closest > this.speed ? super.damageCalc(side.get(closestIndex))
                    : (super.damageCalc(side.get(closestIndex))/2));
            this.shots--;

        }
    }

}