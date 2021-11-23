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
        // faire un if si possible pour comparer à droite ou à gauche
        if (axe.getDepart().getX() == axe.getArrive().getX()) { // Pour le cas d'un axe perpendiculaire à l'axe des abscisses
            this.setX((2 * axe.getDepart().x - this.x));

        } else {
            double a = (axe.getArrive().y - axe.getDepart().y)/(axe.getArrive().x - axe.getDepart().x);
            double b = axe.getDepart().y - a*axe.getDepart().x;
            this.x = (1-Math.pow(a,2) * this.x + 2 * a * this.y - 2*a*b)/(1+Math.pow(a, 2));
            this.y = (2*a*this.x - (1-Math.pow(a, 2))*this.y+2*b)/(1+Math.pow(a, 2));
        }
    }
}
