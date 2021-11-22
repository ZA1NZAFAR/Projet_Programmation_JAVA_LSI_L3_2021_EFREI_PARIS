package objects;

import java.awt.*;

public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
    private Point depart, arrive;
    private double longeur;

    public Ligne(Point depart, Point arrive) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = Math.sqrt(Math.pow(2,(arrive.x - depart.x)) + Math.pow(2, (arrive.y - depart.y)));
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
        this.depart.y = (int) (this.depart.y * valeur * (this.depart.equals(centre)  ? 1 : -1));
        this.arrive.x = (int) (this.arrive.x * valeur * (this.arrive.equals(centre) ? 1 : -1));
        this.arrive.y = (int) (this.arrive.y * valeur * (this.arrive.equals(centre) ? 1 : -1));
    }

    @Override
    public void symetrieAxiale(Ligne axe) {
        // faire un if si possible pour comparer à droite ou à gauche
        this.depart.x = axe.depart.x - this.depart.x;
        this.depart.y = axe.depart.y - this.depart.y;
        this.arrive.x = axe.arrive.x - this.arrive.x;
        this.arrive.y = axe.arrive.y - this.arrive.y;
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
