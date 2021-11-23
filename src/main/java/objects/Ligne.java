package objects;

import java.awt.*;

public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
    private Point depart, arrive;
    private double longeur;

<<<<<<< Updated upstream
    public Ligne(Point depart, Point arrive) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = Math.sqrt(Math.pow(2, (arrive.x - depart.x)) + Math.pow(2, (arrive.y - depart.y)));
    }

=======
    /***
     * Initialise une ligne avec des points donnés
     * @param depart point de départ de la ligne
     * @param arrive point d'arrivé de la ligne
     */
    public Ligne(Point depart, Point arrive) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = Math.sqrt(Math.pow(2, (arrive.getX() - depart.getX())) + Math.pow(2, (arrive.getY() - depart.getY())));
    }

    /***
     * Calcule le périmètre d'une ligne, le périmètre d'une ligne est sa longuer
     * @return la longeur de la ligne
     */
>>>>>>> Stashed changes
    @Override
    public double calculerPerimetre() {
        return longeur;
    }

<<<<<<< Updated upstream
=======
    /***
     * L'aire d'une ligne est nulle
     * @return 0.0
     */
>>>>>>> Stashed changes
    @Override
    public double calculerAire() {
        return 0.0;
    }

<<<<<<< Updated upstream
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
=======
    /***
     * Fait une translation d'une ligne vers un point donné
     * @param deplacement point vers lequel on veut que la ligne soit sur
     */
    @Override
    public void translation(Point deplacement) {
        this.depart.set(new Point(deplacement.getX()+depart.getX(),deplacement.getY()+depart.getY()));
        this.arrive.set(new Point(deplacement.getX()+arrive.getX(),deplacement.getY()+arrive.getY()));
    }

    /***
     * Fait l'homothétie d'une ligne un rapport à un point
     * @param valeur le rapport de homothétie
     * @param centre le centre où la homothétie se projette
     */
    @Override
    public void homothetie(double valeur, Point centre) {
        longeur = longeur * valeur;
        this.depart.setX(this.depart.getX() * valeur * (this.depart.equals(centre) ? 1 : -1));
        this.depart.setY(this.depart.getY() * valeur * (this.depart.equals(centre) ? 1 : -1));
        this.arrive.setX(this.arrive.getX() * valeur * (this.arrive.equals(centre) ? 1 : -1));
        this.arrive.setY(this.arrive.getY() * valeur * (this.arrive.equals(centre) ? 1 : -1));
>>>>>>> Stashed changes
    }

    @Override
    public void symetrieAxiale(Ligne axe) {
<<<<<<< Updated upstream
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
=======
        depart.symetrieAxiale(axe);
        arrive.symetrieAxiale(axe);
>>>>>>> Stashed changes
    }

    @Override
    public int compareTo(Ligne o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else return 1;
    }

<<<<<<< Updated upstream
    @Override
    public String toString() {
        return "Ligne{" +
                "depart=" + depart +
                ", arrive=" + arrive +
=======
    public Point getDepart() {
        return depart;
    }

    public Point getArrive() {
        return arrive;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "depart=" + depart.getX() + "," + depart.getY() +
                ", arrive=" + arrive.getX() + "," + depart.getY() +
>>>>>>> Stashed changes
                ", longeur=" + longeur +
                '}';
    }
}
