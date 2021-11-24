package objects;

import iface.Geometricable;
import tools.Constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static tools.Constants.Axe;

public class Image implements Geometricable {
    List<FormeGeometrique> formes;


    public Image() {
        this.formes = new ArrayList<>();
    }

    /***
     * Permet d'ajouter une forme dans l'image sans avoir des doublons
     */
    public void ajoutFormes(FormeGeometrique formeGeometrique) {
        if (formes.contains(formeGeometrique))
            throw new IllegalArgumentException("Les doublons ne sont pas permis!");
        formes.add(formeGeometrique);
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

    @Override
    public void changeTrieType(Constants.TriePar par) {
        for (FormeGeometrique forme : formes) {
            forme.changeTrieType(par);
        }
    }

    @Override
    public void rotate(int angle) {
        for (FormeGeometrique forme : formes) {
            forme.rotate(angle);
        }
    }

    public void trierParPerimetre() {
        for (FormeGeometrique forme : formes) {
            forme.setTriePar(Constants.TriePar.PERIMETRE);
        }
        Collections.sort(formes);
    }

    public List<FormeGeometrique> getFormes() {
        return formes;
    }

    public void setFormes(List<FormeGeometrique> formes) {
        this.formes = formes;
    }

    @Override
    public String toString() {
        return "Image{" +
                "formes=" + formes +
                '}';
    }
}
