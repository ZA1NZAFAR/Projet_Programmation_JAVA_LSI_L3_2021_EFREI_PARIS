package objects;

public class Cercle extends FormeGeometrique implements Comparable<Cercle>{
    private Double rayon;

    @Override
    public Double calculerPerimetre() {
        return null;
    }

    @Override
    public Double calculerAire() {
        return null;
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
}
