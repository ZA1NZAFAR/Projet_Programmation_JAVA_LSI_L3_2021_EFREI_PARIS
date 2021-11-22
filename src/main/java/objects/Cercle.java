package objects;

public class Cercle extends FormeGeometrique implements Comparable<Cercle> {
    private Point centre = new Point();
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
        this.centre.set(new Point(deplacement.getX() + centre.getX(),deplacement.getY() + centre.getY()));
    }

    @Override
    public void homothetie(double valeur, Point centre) {
        this.rayon *= valeur;
        this.centre.setX((this.centre.getX() * valeur * (this.centre.equals(centre) ? 1 : -1)));
        this.centre.setY((this.centre.getY() * valeur * (this.centre.equals(centre) ? 1 : -1)));
    }

    @Override
    public void symetrieAxiale(Ligne axe) {
        this.centre.setX(axe.milieu().getX() + this.centre.getX());
        this.centre.setY(axe.milieu().getY() + this.centre.getY());
    }

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
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }
}
