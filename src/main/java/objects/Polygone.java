package objects;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
    public Double calculerPerimetre() {
        return lines.stream().map(Ligne::calculerPerimetre).collect(Collectors.toList()).stream().mapToDouble(Double::doubleValue).sum();
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
