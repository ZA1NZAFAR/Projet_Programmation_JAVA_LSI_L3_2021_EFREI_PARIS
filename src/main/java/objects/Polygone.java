package objects;

import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Polygon;

import java.util.HashSet;
import java.util.Set;
import static objects.Constants.Axe;

public class Polygone extends Polygon implements Comparable<Polygone>,FormeGeometrique {
    private Point centre;
    private Set<Ligne> lines;
    protected int angle;

    public void rotate(int angle) {
        this.angle += angle;
        while (this.angle > 360) this.angle -= 360;
        while (this.angle < 0) this.angle += 360;
        if (this.angle % 360 == 0) this.angle = 0;
    }

    public Polygone() {
        super();
        lines = new HashSet<>();
    }

    /***
     * Initialise un polygone avec un centre et un Set de lignes pour éviter les duplicats
     * @param centre centre du polygone
     * @param lines set de lignes
     */
    public Polygone(Point centre, Set<Ligne> lines) {
        Coordinate[] polygonCoordinates = (Coordinate[]) lines.toArray();
        super(polygonCoordinates);
        this.centre = centre;
        this.lines = lines;
    }


    @Override
    public double calculerPerimetre() {
        double perimetre = 0;
        for (Ligne line : lines) {
            perimetre += line.calculerPerimetre();
        }
        return perimetre;
    }

    @Override
    public double calculerAire() {
        return 0.;
    }

    @Override
    public void translation(Point deplacement) {
        for (Ligne line : lines) {
            line.translation(deplacement);
        }
    }

    @Override
    public void homothetie(double valeur) {
        for (Ligne line : lines) {
            line.homothetie(valeur);
        }
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        for (Ligne line : lines) {
            line.symetrieAxiale(axe);
        }
    }

    @Override
    public void symetrieCentrale() {
        for (Ligne line : lines) {
            line.symetrieCentrale();
        }
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
        return "Polygone :" +
                "\n Centre=" + centre +
                "\n Lines=" + lines +
                "\n";
    }
}
