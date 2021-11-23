package objects;

import java.util.HashSet;
import java.util.Set;

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
    public void symetrieAxiale(Ligne axe) {
        for (Ligne line : lines) {
            line.symetrieAxiale(axe);
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
