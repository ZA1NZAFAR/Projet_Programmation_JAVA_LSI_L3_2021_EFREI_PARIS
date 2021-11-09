package objects;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Polygone extends FormeGeometrique implements Comparable<Polygone> {
    private Point centre;
    private List<Ligne> lines;


    public Polygone() {
        lines = new ArrayList<>();
    }

    public Polygone(Point centre, List<Ligne> lines) {
        this.centre = centre;
        this.lines = lines;
    }

    @Override
    public Double calculerPerimetre() {
        return null;
    }

    @Override
    public Double calculerAire() {
        return null;
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
