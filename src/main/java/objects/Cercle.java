package objects;

import static tools.Constants.Axe;

public class Cercle extends FormeGeometrique {
    private Point centre;
    private Double rayon;

    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public double calculerPerimetre() {
        return Math.round((2 * Math.PI * rayon) * 100.0) / 100.0;
    }

    @Override
    public double calculerAire() {
        return Math.round((rayon * rayon * Math.PI) * 100.0) / 100.0;
    }

    @Override
    public void translation(Point deplacement) {
        this.centre.translation(deplacement);
    }

    @Override
    public void homothetie(double valeur) {
        this.rayon *= valeur;
        this.centre.homothetie(valeur);
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        this.centre.symetrieAxiale(axe);
    }

    @Override
    public void symetrieCentrale() {
        this.centre.symetrieCentrale();
    }

    @Override
    public String toString() {
        return "Cercle :" +
                "\n Centre=" + centre.getX() + "," + centre.getY() +
                "\n Rayon=" + rayon +
                "\n Aire=" + this.calculerAire() +
                "\n Perimetre=" + this.calculerPerimetre() + "\n";
    }

    //Getters et Setters
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }
}
