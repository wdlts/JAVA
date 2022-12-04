package DZ.DZ1_OOP;

public class Vector2 {
    public int x, y;

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean isEqual (Vector2 pos){
        return pos.y == y & pos.x == x;
    }


    public float getDistance(Vector2 position) {
        return (float) Math.sqrt((x - position.x) * (x - position.x)+(y-position.y)*(y-position.y));
    }
}
