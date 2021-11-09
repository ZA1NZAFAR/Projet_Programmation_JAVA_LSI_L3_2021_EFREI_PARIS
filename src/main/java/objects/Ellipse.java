package objects;

public class Ellipse extends FormeGeometrique implements Comparable<Ellipse> {
    private double x, y, width, height;

    public Ellipse(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
    public int compareTo(Ellipse o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre()<o.calculerPerimetre())
            return -1;
        else
            return 1;
    }
}
