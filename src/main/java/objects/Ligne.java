package objects;

import static tools.Constants.Axe;

public class Ligne extends FormeGeometrique {
    private Point depart, arrive;
    private double longeur;

    public Ligne(Point depart, Point arrive) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = Math.sqrt(Math.pow(2, (arrive.getX() - depart.getX())) + Math.pow(2, (arrive.getY() - depart.getY())));
    }

    @Override
    public double calculerPerimetre() {
        return longeur;
    }

    @Override
    public double calculerAire() {
        return 0.0;
    }

    @Override
    public void translation(Point deplacement) {
        this.depart.translation(deplacement);
        this.arrive.translation(deplacement);
    }

    @Override
    public void homothetie(double valeur) {
        longeur = (longeur * valeur);
        this.depart.homothetie(valeur);
        this.arrive.homothetie(valeur);
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        this.depart.symetrieAxiale(axe);
        this.arrive.symetrieAxiale(axe);
    }

    @Override
    public void symetrieCentrale() {
        this.depart.symetrieCentrale();
        this.arrive.symetrieCentrale();
    }

    public Point getDepart() {
        return depart;
    }

    public Point getArrive() {
        return arrive;
    }

    @Override
    public String toString() {
        return "[Ligne : " +
                " Point de depart = " + depart.getX() + "," + depart.getY() +
                " Point d'arrive=" + arrive.getX() + "," + arrive.getY() +
                " Longeur =" + longeur +
                " Perimetre =" + calculerPerimetre() +
                " Aire =" + calculerAire() + "]";
    }

    public void setDepart(Point depart) {
        this.depart = depart;
    }

    public void setArrive(Point arrive) {
        this.arrive = arrive;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }
}
