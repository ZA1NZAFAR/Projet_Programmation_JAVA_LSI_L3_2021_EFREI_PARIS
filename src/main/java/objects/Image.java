package objects;

import java.util.ArrayList;
import java.util.List;

public class Image {
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

    public double calculerAireTotale() {
        double aireTotale = 0.0;
        for (FormeGeometrique f : formes) {
            aireTotale += f.calculerAire();
        }
        return aireTotale;
    }

    @Override
    public String toString() {
        return "Image{" +
                "formes=" + formes +
                '}';
    }
}
