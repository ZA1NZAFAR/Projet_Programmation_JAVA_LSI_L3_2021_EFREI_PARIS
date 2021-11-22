package objects;

import java.awt.*;

public class Ellipse extends FormeGeometrique implements Comparable<Ellipse> {
    private Point centre;
    private double width, height;

    public Ellipse(Point centre, double width, double height) {
        this.centre = centre;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculerPerimetre() {
        return Math.round((2 * Math.PI) * Math.sqrt((Math.pow(width / 2, 2) * Math.pow(height / 2, 2)) / 2));
    }

    @Override
    public double calculerAire() {
        return Math.round(((width / 2) * (height / 2) * Math.PI) * 100.0) / 100.0;
    }

    @Override
    public void translation(Point deplacement) {
        this.centre.move(deplacement.x + centre.x, deplacement.y + centre.y);
    }

    @Override
    public void homothetie(double valeur, Point centre) {
        this.width *= valeur;
        this.height *= valeur;
        this.centre.x = (int) (this.centre.x * valeur * (this.centre.equals(centre) ? 1 : -1));
        this.centre.y = (int) (this.centre.y * valeur * (this.centre.equals(centre) ? 1 : -1));
    }

    @Override
    public int compareTo(Ellipse o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "centre=" + centre +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
