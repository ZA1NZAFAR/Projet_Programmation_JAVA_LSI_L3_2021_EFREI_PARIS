package objects;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Polygone extends FormeGeometrique implements Comparable<Polygone> {
    private Point centre;
    private Set<Ligne> lines;


    public Polygone() {
        lines = new HashSet<>();
    }

    public Polygone(Point centre, Set<Ligne> lines) {
        this.centre = centre;
        this.lines = lines;
    }

    @Override
    public double calculerPerimetre() {
        double perimetre = 0;
        for (Ligne lines : lines) {
            perimetre += lines.calculerPerimetre();
        }
        return perimetre;
    }

    @Override
    public double calculerAire() {
        return 0.;
    }

    @Override
    public int compareTo(Polygone o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Polygone{" +
                "centre=" + centre +
                ", lines=" + lines +
                '}';
    }
}
