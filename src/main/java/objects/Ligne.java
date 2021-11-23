package objects;

import java.awt.*;

public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
    private Point depart, arrive;
    private double longeur;

    public Ligne(Point depart, Point arrive) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = Math.sqrt(Math.pow(2, (arrive.x - depart.x)) + Math.pow(2, (arrive.y - depart.y)));
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
        this.depart.move(deplacement.x + depart.x, deplacement.y + depart.y);
        this.arrive.move(deplacement.x + arrive.x, deplacement.y + arrive.y);
    }

    @Override
    public void homothetie(double valeur, Point centre) {
        longeur = longeur * valeur;
        this.depart.x = (int) (this.depart.x * valeur * (this.depart.equals(centre) ? 1 : -1));
        this.depart.y = (int) (this.depart.y * valeur * (this.depart.equals(centre) ? 1 : -1));
        this.arrive.x = (int) (this.arrive.x * valeur * (this.arrive.equals(centre) ? 1 : -1));
        this.arrive.y = (int) (this.arrive.y * valeur * (this.arrive.equals(centre) ? 1 : -1));
    }

    @Override
    public void symetrieAxiale(Ligne axe) {
        // faire un if si possible pour comparer à droite ou à gauche
        if (axe.depart.getX() == axe.arrive.getX()) { // Pour le cas d'un axe perpendiculaire à l'axe des abscisses
            this.depart.x = (2 * axe.depart.x - this.depart.x);
            this.arrive.x = (2 * axe.arrive.x - this.arrive.x);
        } else {
            double a = (axe.arrive.y - axe.depart.y)/(axe.arrive.x - axe.depart.x);
            double b = axe.depart.y - axe.depart.x;
            this.depart.x = (int) ((1-Math.pow(a,2) * this.depart.x + 2 * a * this.depart.y - 2*a*b)/(1+Math.pow(a, 2)));
            this.depart.y = (int) ((2*a*this.depart.x - (1-Math.pow(a, 2))*this.depart.y+2*b)/(1+Math.pow(a, 2)));
            this.arrive.x = (int) ((1-Math.pow(a,2) * this.arrive.x + 2 * a * this.arrive.y - 2*a*b)/(1+Math.pow(a, 2)));
            this.arrive.y = (int) ((2*a*this.arrive.x - (1-Math.pow(a, 2))*this.arrive.y+2*b)/(1+Math.pow(a, 2)));
        }
    }

    @Override
    public int compareTo(Ligne o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "depart=" + depart +
                ", arrive=" + arrive +
                ", longeur=" + longeur +
                '}';
    }
}
