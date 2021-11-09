package objects;

import java.awt.*;

public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
    private Point depart, arrive;
    private Double longeur;

    @Override
    public Double calculerPerimetre() {
        return longeur;
    }

    @Override
    public Double calculerAire() {
        return 0.0;
    }

    @Override
    public int compareTo(Ligne o) {
        if (this.longeur == o.longeur)
            return 0;
        else if (this.longeur < o.longeur)
            return -1;
        else return 1;
    }
}
