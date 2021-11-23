package objects;

import java.util.HashSet;
import java.util.Set;

import static objects.Constants.Axe;

public class Dessin implements Geometricable {
    Set<Image> images;

    public Dessin(Set<Image> formes) {
        this.images = formes;
    }

    public Dessin() {
        this.images = new HashSet<>();
    }

    @Override
    public double calculerPerimetre() {
        double res = 0.0;
        for (Image img : images) {
            res += img.calculerPerimetre();
        }
        return res;
    }

    @Override
    public double calculerAire() {
        double res = 0.0;
        for (Image img : images) {
            res += img.calculerAire();
        }
        return res;
    }

    @Override
    public void translation(Point deplacement) {
        for (Image img : images) {
            img.translation(deplacement);
        }
    }

    @Override
    public void homothetie(double value) {
        for (Image img : images) {
            img.homothetie(value);
        }
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        for (Image img : images) {
            img.symetrieAxiale(axe);
        }
    }

    @Override
    public void symetrieCentrale() {
        for (Image img : images) {
            img.symetrieCentrale();
        }
    }
}
