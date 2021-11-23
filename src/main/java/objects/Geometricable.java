package objects;

public interface Geometricable {
    double calculerPerimetre();

    double calculerAire();

    void translation(Point deplacement);

    void homothetie(double value);

    void symetrieAxiale(Constants.Axe axe);

    void symetrieCentrale();
}
