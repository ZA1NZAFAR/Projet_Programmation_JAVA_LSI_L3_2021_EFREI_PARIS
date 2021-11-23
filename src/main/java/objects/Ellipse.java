package objects;

public class Ellipse extends FormeGeometrique implements Comparable<Ellipse> {
    private Point centre = new Point();
    private double width, height;

    public Ellipse(Point centre, double width, double height) {
        this.centre = centre;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculerPerimetre() {
        return Math.round((2 * Math.PI) * Math.sqrt((Math.pow(width / 2, 2) * Math.pow(height / 2, 2)) / 2));
    }

    @Override
    public double calculerAire() {
        return Math.round(((width / 2) * (height / 2) * Math.PI) * 100.0) / 100.0;
    }

    @Override
    public void translation(Point deplacement) {
        this.centre.set(new Point(deplacement.getX() + centre.getX(), deplacement.getY() + centre.getY()));
    }

    @Override
    public void homothetie(double valeur, Point centre) {
        this.width *= valeur;
        this.height *= valeur;
        this.centre.setX((this.centre.getX() * valeur * (this.centre.equals(centre) ? 1 : -1)));
        this.centre.setY((this.centre.getY() * valeur * (this.centre.equals(centre) ? 1 : -1)));
    }

    @Override
    public void symetrieAxiale(Ligne axe) {

    }

    @Override
    public int compareTo(Ellipse o) {
        if (this.calculerPerimetre() == o.calculerPerimetre())
            return 0;
        else if (this.calculerPerimetre() < o.calculerPerimetre())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "centre=" + centre.getX() + "," +centre.getY() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
