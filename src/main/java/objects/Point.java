package objects;

public class Point extends FormeGeometrique {
    private double x;
    private double y;

    public Point (){
        this.x = 0.;
        this.y = 0.;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void set(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public double calculerPerimetre() {
        return 0;
    }

    @Override
    public double calculerAire() {
        return 0;
    }

    @Override
    public void translation(Point deplacement) {

    }

    @Override
    public void homothetie(double value, Point centre) {

    }

    @Override
    public void symetrieAxiale(Ligne axe) {

    }
}
