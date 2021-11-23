package objects;

public class Cercle extends FormeGeometrique implements Comparable<Cercle> {
    private Point centre = new Point();
    private Double rayon;

    /***
     * Initialise le cercle ayant un centre et un rayon donnée
     * @param centre le centre du cercle
     * @param rayon le rayon du cercle
     */
    public Cercle(Point centre, Double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    /***
     * Calcule le périmètre du cercle
     * @return la valeur mathématique du calcul du périmètre
     */
    @Override
    public double calculerPerimetre() {
        return Math.round((2 * Math.PI * rayon) * 100.0) / 100.0;
    }

    /***
     * Calcule l'aire du cercle
     * @return la valeur mathématique du calcul de l'aire
     */
    @Override
    public double calculerAire() {
        return Math.round((rayon * rayon * Math.PI) * 100.0) / 100.0;
    }

    /***
     * Fait la translation d'un cercle vers un point donné
     * @param deplacement le point où le centre du cercle va se diriger
     */
    @Override
    public void translation(Point deplacement) {
        this.centre.set(new Point(deplacement.getX() + centre.getX(),deplacement.getY() + centre.getY()));
    }

    /***
     * Fait l'homothétie d'un cercle vers un point donné
     * @param valeur le rapport de l'homothétie
     * @param centre le centre où l'homothétie sera faite
     */
    @Override
    public void homothetie(double valeur, Point centre) {
        this.rayon *= valeur;
        this.centre.setX((this.centre.getX() * valeur * (this.centre.equals(centre) ? 1 : -1)));
        this.centre.setY((this.centre.getY() * valeur * (this.centre.equals(centre) ? 1 : -1)));
    }

    /***
     * Fait la symétrie axiale selon un axe donnée
     * @param axe l'axe où la symétrie axiale sera faite
     */
    @Override
    public void symetrieAxiale(Ligne axe) {
        this.centre.setX(axe.milieu().getX() + this.centre.getX());
        this.centre.setY(axe.milieu().getY() + this.centre.getY());
    }

    /***
     * Permet de comparer les périmètres de 2 cercles
     * @param o cercle o à comparer avec le cercle actuel
     * @return 0 si le périmètre est égale
     * @return -1 si le périmètre du cercle est inférieur au cercle mis en paramètre
     * @return 1 si le périmètre de notre cercle est supérieur au cercle o mis en paramètre
     */
    @Override
    public int compareTo(Cercle o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre.getX() + "," + centre.getY() +
                ", rayon=" + rayon +
                '}';
    }
}
