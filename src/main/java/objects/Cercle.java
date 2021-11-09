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
    public Double calculerPerimetre() {
        return Double.parseDouble(String.format("%.3f",2 * Math.PI * rayon)) ;
    }

    @Override
    public Double calculerAire() {
        return Double.parseDouble(String.format("%.3f",rayon * rayon * Math.PI));
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
