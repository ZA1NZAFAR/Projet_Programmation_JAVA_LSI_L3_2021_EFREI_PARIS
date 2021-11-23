package objects;

import org.locationtech.jts.geom.GeometryFactory;
import tools.Tools;

import java.util.HashSet;
import java.util.Set;

import static tools.Constants.Axe;

public class Polygone extends FormeGeometrique implements Comparable<Polygone> {
    private Point centre;
    private Set<Ligne> lines;


    public Polygone() {
        lines = new HashSet<>();
    }

    /***
     * Initialise un polygone avec un centre et un Set de lignes pour éviter les duplicats
     * @param centre centre du polygone
     * @param lines set de lignes
     */
    public Polygone(Point centre, Set<Ligne> lines) {
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
        return new GeometryFactory().createPolygon(Tools.linePointsToCoordinates(lines)).getArea();
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
        return Double.compare(this.calculerPerimetre(), o.calculerPerimetre());
    }

    @Override
    public String toString() {
        return "Polygone :" +
                "\n Centre=" + centre +
                "\n Lines=" + lines +
                "\n";
    }
}
