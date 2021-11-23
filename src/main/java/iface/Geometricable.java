package iface;

import tools.Constants;
import objects.Point;

public interface Geometricable {
    double calculerPerimetre();

    double calculerAire();

    void translation(Point deplacement);

    void homothetie(double value);

    void symetrieAxiale(Constants.Axe axe);

    void symetrieCentrale();
}
