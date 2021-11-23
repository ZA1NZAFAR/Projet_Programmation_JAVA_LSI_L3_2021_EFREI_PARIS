package objects;


public abstract class FormeGeometrique {
    private Constants.Orientation orientation = Constants.Orientation.DEFAUT;
    //private Color color;


    public abstract double calculerPerimetre();

    public abstract double calculerAire();

    public abstract void translation(Point deplacement);

    public abstract void homothetie(double value);

    public abstract void symetrieAxiale(Ligne axe);

    public abstract void symetrieCentrale(Ligne axe);

    public void setOrientation(Constants.Orientation orientation) {
        this.orientation = orientation;
    }

//    public void setColor(Color color) {
//        this.color = color;
//    }


}
