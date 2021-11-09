package objects;

import java.awt.*;

public class Ellipse extends FormeGeometrique implements Comparable<Ellipse> {
    private Point centre;
    private double width, height;

    public Ellipse(Point centre, double width, double height) {
        this.centre = centre;
        this.width = width;
        this.height = height;
    }

    @Override
    public Double calculerPerimetre() {
        return (2 * Math.PI) * Math.sqrt((Math.pow(width / 2, 2) * Math.pow(height / 2, 2)) / 2);
    }

    @Override
    public Double calculerAire() {
        return (width / 2) * (height / 2) * Math.PI;
    }

    @Override
    public int compareTo(Ellipse o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "centre=" + centre +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
