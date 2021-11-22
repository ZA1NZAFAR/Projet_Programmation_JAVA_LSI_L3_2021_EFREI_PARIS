package objects;


public class Ligne extends FormeGeometrique implements Comparable<Ligne> {
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
        this.depart.set(new Point(deplacement.getX() + depart.getX(), deplacement.getY() + depart.getY()));
        this.arrive.set(new Point(deplacement.getX() + arrive.getX(), deplacement.getY() + arrive.getY()));
    }

    @Override
    public void homothetie(double valeur, Point centre) {
        longeur = longeur * valeur; // essayer avec des vecteurs
        Ligne vecteur1 = new Ligne(depart, centre);
        Ligne vecteur2 = new Ligne(arrive, centre);
        if (valeur > 0) {
            this.depart.setX((valeur * vecteur1.getDepart().getX()));
            this.depart.setY((valeur * vecteur1.getDepart().getY()));
            this.arrive.setX((valeur * vecteur1.getArrive().getX()));
            this.arrive.setY((valeur * vecteur1.getArrive().getY()));
        } else if (valeur < 0) {
            this.depart.setX((-valeur * vecteur1.getDepart().getX()));
            this.depart.setY((-valeur * vecteur1.getDepart().getY()));
            this.arrive.setX((-valeur * vecteur1.getArrive().getX()));
            this.arrive.setY((-valeur * vecteur1.getArrive().getY()));
        }
    }

    @Override
    public void symetrieAxiale(Ligne axe) {
        // faire un if si possible pour comparer à droite ou à gauche
        this.depart.setX(axe.depart.getX() + this.depart.getX());
        this.depart.setY(axe.depart.getY() + this.depart.getY());
        this.arrive.setX(axe.arrive.getX() + this.arrive.getX());
        this.arrive.setY(axe.arrive.getY() + this.arrive.getY());
    }

    @Override
    public int compareTo(Ligne o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else return 1;
    }

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
                "depart=" + depart +
                ", arrive=" + arrive +
                ", longeur=" + longeur +
                '}';
    }
}
