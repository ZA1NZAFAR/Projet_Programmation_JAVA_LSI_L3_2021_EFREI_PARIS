package objects;

import static tools.Constants.Axe;

public class Ellipse extends FormeGeometrique {
    private Point centre;
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
        this.centre.translation(deplacement);
    }

    @Override
    public void homothetie(double valeur) {
        this.width *= valeur;
        this.height *= valeur;
        this.centre.homothetie(valeur);
        if (valeur < 0) {
            this.rotate(180);
        }
    }

    @Override
    public void symetrieAxiale(Axe axe) {
        this.centre.symetrieAxiale(axe);
        double tmp = this.height;
        this.height = this.width;
        this.width = tmp;
    }

    @Override
    public void symetrieCentrale() {
        this.centre.symetrieCentrale();
        double tmp = this.height;
        this.height = this.width;
        this.width = tmp;
    }

//    @Override
//    public int compareTo(Ellipse o) {
//        return Double.compare(this.calculerPerimetre(), o.calculerPerimetre());
//    }

    @Override
    public String toString() {
        return "Ellipse :" +
                "\n Centre=" + centre.getX() + "," + centre.getY() +
                "\n Width=" + width +
                "\n Height=" + height + "\n";
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
