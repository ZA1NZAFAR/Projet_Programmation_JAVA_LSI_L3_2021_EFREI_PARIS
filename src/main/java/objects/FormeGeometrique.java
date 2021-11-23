package objects;

import static objects.Constants.Axe;

public interface FormeGeometrique {

    public abstract double calculerPerimetre();

    public abstract double calculerAire();

    public abstract void translation(Point deplacement);

    public abstract void homothetie(double value);

    public abstract void symetrieAxiale(Axe axe);

    public abstract void symetrieCentrale();
}
