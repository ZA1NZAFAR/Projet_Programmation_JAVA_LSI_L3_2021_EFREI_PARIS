package objects;

import static objects.Constants.Axe;

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
        this.setX(deplacement.getX());
        this.setY(deplacement.getY());
    }

    @Override
    public void homothetie(double value) {
        this.setX(this.getX() * value);
        this.setY(this.getY() * value);
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        if (axe.equals(Axe.ABCISSE)) { //si l'axe donné est l'abscisse
            if (this.getX() > 0)
                this.setX(-this.getX());
            else
                this.setX(Math.abs(this.getX()));
        } else if (axe.equals(Axe.ORDONNEE)) { //si l'axe donné est l'ordonnée
            if (this.getY() > 0)
                this.setY(-this.getY());
            else
                this.setY(Math.abs(this.getY()));
        }
    }

    @Override
    public void symetrieCentrale(Ligne axe) {

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
