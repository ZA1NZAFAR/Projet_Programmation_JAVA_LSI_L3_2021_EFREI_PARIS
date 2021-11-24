package objects;

import iface.Geometricable;
import tools.Constants;

import java.util.ArrayList;
import java.util.List;

import static tools.Constants.Axe;

public class Dessin implements Geometricable {
    List<Image> images;

    public Dessin(List<Image> formes) {
        this.images = formes;
    }

    public Dessin() {
        this.images = new ArrayList<>();
    }

    /***
     * Permet d'ajouter une image dans le dessin sans avoir des doublons
     */
    public void ajouterImage(Image image) {
        if (images.contains(image))
            throw new IllegalArgumentException("Les doublons ne sont pas permis!");
        images.add(image);
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

    @Override
    public void changeTrieType(Constants.TriePar par) {
        for (Image image : images) {
            image.changeTrieType(par);
        }
    }

    @Override
    public void rotate(int angle) {
        for (Image image : images) {
            image.rotate(angle);
        }
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Dessin{" +
                "images=" + images +
                '}';
    }
}
