package objects;

import java.util.ArrayList;
import java.util.List;

public class Polygone extends FormeGeometrique implements Comparable<Polygone> {
    private List<Ligne> lines;

    public Polygone() {
        lines = new ArrayList<>();
    }

    public Polygone(List<Ligne> lines) {
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
}
