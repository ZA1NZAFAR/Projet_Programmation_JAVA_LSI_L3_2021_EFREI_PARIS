package objects;

import static objects.Constants.Axe;

public abstract class FormeGeometrique implements Geometricable{
    protected int angle;

    public void rotate(int angle) {
        this.angle += angle;
        while (this.angle > 360) this.angle -= 360;
        while (this.angle < 0) this.angle += 360;
        if (this.angle % 360 == 0) this.angle = 0;
    }
}
