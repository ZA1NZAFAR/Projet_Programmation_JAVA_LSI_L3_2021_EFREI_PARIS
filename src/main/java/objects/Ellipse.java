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
    public void homothetie(double valeur) {
        this.width *= valeur;
        this.height *= valeur;
        this.centre.homothetie(valeur);
        if (valeur < 0){
            this.setOrientation(Constants.Orientation.HORIZONTAL_D);
        }
    }

    @Override
    public void symetrieAxiale(Ligne axe) {
        this.centre.symetrieAxiale(axe);
        if (axe.getDepart().getY() == 0 && axe.getArrive().getY() == 0) { //si l'axe donné est l'abscisse
            if (this.centre.getX() > 0)
                this.setOrientation(Constants.Orientation.HORIZONTAL_G);
            else
                this.setOrientation(Constants.Orientation.HORIZONTAL_D);
        } else if (axe.getDepart().getX() == 0 && axe.getArrive().getX() == 0)//si l'axe donné est l'ordonnée
                this.setOrientation(Constants.Orientation.INVERSE);

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
        return "Ellipse :" +
                "\n Centre=" + centre.getX() + "," +centre.getY() +
                "\n Width=" + width +
                "\n Height=" + height + "\n";
    }
}
