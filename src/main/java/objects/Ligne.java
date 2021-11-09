package objects;

import java.awt.*;

public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
    private Point depart, arrive;
    private Double longeur;

    public Ligne(Point depart, Point arrive, Double longeur) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = longeur;
    }

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
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "depart=" + depart +
                ", arrive=" + arrive +
                ", longeur=" + longeur +
                '}';
    }
}
