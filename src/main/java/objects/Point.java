package objects;

import static tools.Constants.Axe;

public class Point extends FormeGeometrique implements Comparable<Point> {
    private double x;
    private double y;

    public Point() {
        this.x = 0.;
        this.y = 0.;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void set(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public double calculerPerimetre() {
        return 0;
    }

    @Override
    public double calculerAire() {
        return 0;
    }

    @Override
    public void translation(Point deplacement) {
        this.setX(this.getX() + deplacement.getX());
        this.setY(this.getY() + deplacement.getY());
    }

    @Override
    public void homothetie(double value) {
        this.setX(this.getX() * value);
        this.setY(this.getY() * value);
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        switch (axe) {
            case ABCISSE:  //si l'axe donné est l'abscisse
                this.setY(this.getY() > 0 ? -this.getY() : Math.abs(this.getY()));
                break;
            case ORDONNEE:  //si l'axe donné est l'ordonnée
                this.setX(this.getX() > 0 ? -this.getX() : Math.abs(this.getX()));
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public void symetrieCentrale() {
        this.setX(this.getX() > 0 ? -this.getX() : Math.abs(this.getX()));
        this.setY(this.getY() > 0 ? -this.getY() : Math.abs(this.getY()));
    }

    @Override
    public String toString() {
        return "Point :" +
                "x= " + x +
                " , y= " + y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.getX() + this.getY() < o.getX() + o.getY())
            return 0;
        else
            return 1;
    }
}
