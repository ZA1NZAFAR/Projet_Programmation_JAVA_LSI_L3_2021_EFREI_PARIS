package objects;

import java.awt.*;

public class Cercle extends FormeGeometrique implements Comparable<Cercle> {
    private Point centre;
    private Double rayon;


    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double calculerPerimetre() {
        return Math.round((2 * Math.PI * rayon) * 100.0) / 100.0;
    }

    @Override
    public double calculerAire() {
        return Math.round((rayon * rayon * Math.PI) * 100.0) / 100.0;
    }

    @Override
    public void translation(Point deplacement) {
        this.centre.move(deplacement.x + centre.x, deplacement.y + centre.y);
    }

    @Override
    public void homothetie(double valeur, Point centre) {
        this.rayon *= valeur;
        this.centre.x = (int) (this.centre.x * valeur * (this.centre.equals(centre) ? 1 : -1));
        this.centre.y = (int) (this.centre.y * valeur * (this.centre.equals(centre) ? 1 : -1));
    }

    @Override
    public int compareTo(Cercle o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
