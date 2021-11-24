package objects;

import org.locationtech.jts.geom.GeometryFactory;
import tools.Tools;

import java.util.HashSet;
import java.util.Set;

import static tools.Constants.Axe;

public class Polygone extends FormeGeometrique {
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
    public String toString() {
        return "Polygone{" +
                "centre=" + centre +
                ", lines=" + lines +
                '}' +
                "\n Perimetre=" + calculerPerimetre() +
                "\n Aire=" + calculerAire() + "\n";
    }

    //Getters et Setters

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Set<Ligne> getLines() {
        return lines;
    }

    public void setLines(Set<Ligne> lines) {
        this.lines = lines;
    }
}
