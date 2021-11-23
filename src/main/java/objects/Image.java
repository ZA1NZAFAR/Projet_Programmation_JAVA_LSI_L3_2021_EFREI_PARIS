package objects;

import iface.Geometricable;

import java.util.ArrayList;
import java.util.List;

import static tools.Constants.Axe;

public class Image implements Geometricable {
    List<FormeGeometrique> formes;

    public Image(List<FormeGeometrique> formes) {
        this.formes = formes;
    }

    public Image() {
        this.formes = new ArrayList<>();
    }

    public void ajoutFormes(FormeGeometrique formeGeometrique) {
        formes.add(formeGeometrique);
    }

    @Override
    public String toString() {
        return "Votre Image est composé de : \n" +
                " Formes : \n" + formes + "\n";
    }

    @Override
    public double calculerPerimetre() {
        double res = 0.0;
        for (FormeGeometrique forme : formes) {
            res += forme.calculerPerimetre();
        }
        return res;
    }

    @Override
    public double calculerAire() {
        double res = 0.0;
        for (FormeGeometrique forme : formes) {
            res += forme.calculerAire();
        }
        return res;
    }

    @Override
    public void translation(Point deplacement) {
        for (FormeGeometrique forme : formes) {
            forme.translation(deplacement);
        }
    }

    @Override
    public void homothetie(double value) {
        for (FormeGeometrique forme : formes) {
            forme.homothetie(value);
        }
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        for (FormeGeometrique forme : formes) {
            forme.symetrieAxiale(axe);
        }
    }

    @Override
    public void symetrieCentrale() {
        for (FormeGeometrique forme : formes) {
            forme.symetrieCentrale();
        }
    }
}
