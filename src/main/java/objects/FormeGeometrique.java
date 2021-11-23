package objects;


public abstract class FormeGeometrique {
    protected int angle;

    public void rotate(int angle) {
        this.angle += angle;
        while (this.angle > 360) this.angle -= 360;
        while (this.angle < 0) this.angle += 360;
        if (this.angle % 360 == 0) this.angle = 0;
    }

    public abstract double calculerPerimetre();

    public abstract double calculerAire();

    public abstract void translation(Point deplacement);

    public abstract void homothetie(double value);

    public abstract void symetrieAxiale(Constants.Axe axe);

    public abstract void symetrieCentrale(Ligne axe);
}
