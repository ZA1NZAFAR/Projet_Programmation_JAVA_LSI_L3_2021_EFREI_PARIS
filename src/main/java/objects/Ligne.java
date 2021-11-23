package objects;


public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
    private Point depart, arrive;
    private double longeur;

    /***
     * Initialise une ligne en fonction des paramètres données et qui lui donne une longueur selon ses points
     * @param depart le point de départ de notre ligne
     * @param arrive le point d'arrivé de notre ligne
     */
    public Ligne(Point depart, Point arrive) {
        this.depart = depart;
        this.arrive = arrive;
        this.longeur = Math.sqrt(Math.pow(2,(arrive.getX()-depart.getX())) + Math.pow(2,(arrive.getY()-depart.getY())));
    }

    /***
     * Le périmètre d'une ligne étant sa longueur, retourne sa longeur
     * @return longeur de la ligne
     */
    @Override
    public double calculerPerimetre() {
        return longeur;
    }

    /***
     * Une ligne ne possède pas d'aire
     * @return 0.0
     */
    @Override
    public double calculerAire() {
        return 0.0;
    }

    /***
     * Fait la translation d'une ligne vers un point donné
     * @param deplacement un point vers lequel la ligne va se déplacer
     */
    @Override
    public void translation(Point deplacement) {
        this.depart.set(new Point(deplacement.getX() + depart.getX(), deplacement.getY() + depart.getY()));
        this.arrive.set(new Point(deplacement.getX() + arrive.getX(), deplacement.getY() + arrive.getY()));
    }

    /***
     * Fait l'homothétie de la ligne en fonction d'un point centre
     * @param valeur le rapport de l'homothétie
     * @param centre le centre où l'homothétie sera faite
     */
    @Override
    public void homothetie(double valeur, Point centre) {
        longeur = (longeur * valeur);
        Ligne vecteur1 = new Ligne(this.depart, centre);
        Ligne vecteur2 = new Ligne(this.arrive, centre);
        if (valeur > 0) {
            this.depart.setX((valeur * vecteur1.getDepart().getX()));
            this.depart.setY((valeur * vecteur1.getDepart().getY()));
            this.arrive.setX((valeur * vecteur2.getDepart().getX()));
            this.arrive.setY((valeur * vecteur2.getDepart().getY()));
        } else if (valeur < 0) {
            this.depart.setX((-valeur * vecteur1.getDepart().getX()));
            this.depart.setY((-valeur * vecteur1.getDepart().getY()));
            this.arrive.setX((-valeur * vecteur2.getDepart().getX()));
            this.arrive.setY((-valeur * vecteur2.getDepart().getY()));
        }
    }

    /***
     * Fait la symétrie axiale selon un axe donnée
     * @param axe l'axe où la symétrie axiale sera faite
     */
    @Override
    public void symetrieAxiale(Ligne axe) {
        this.depart.setX(axe.depart.getX() + this.depart.getX());
        this.depart.setY(axe.depart.getY() + this.depart.getY());
        this.arrive.setX(axe.arrive.getX() + this.arrive.getX());
        this.arrive.setY(axe.arrive.getY() + this.arrive.getY());
    }

    /***
     * Permet de comparer les périmètres des lignes (longeurs)
     * @param o ligne o à comparer avec la ligne actuelle
     * @return 0 si la longeur est égale
     * @return -1 si la longeur de la ligne est moins longue que la ligne o mis en paramètre
     * @return 1 si la longeur de notre ligne est supérieur à la ligne o mis en paramètre
     */
    @Override
    public int compareTo(Ligne o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else return 1;
    }

    /***
     * Permet de calculer le milieu d'une ligne
     * @return le milieu de la ligne
     */
    public Point milieu() {
        Point milieu = new Point();
        milieu.setX((this.depart.getX() + this.arrive.getX()) / 2);
        milieu.setY((this.depart.getY() + this.depart.getY()) / 2);
        return milieu;
    }

    public Point getDepart() {
        return depart;
    }

    public Point getArrive() {
        return arrive;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "depart=" + depart.getX() + "," + depart.getY()+
                ", arrive=" + arrive.getX() + "," + arrive.getY() +
                ", longeur=" + longeur +
                '}';
    }
}
