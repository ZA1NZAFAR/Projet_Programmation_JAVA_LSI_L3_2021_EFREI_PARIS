import objects.Image;
import objects.*;

import java.util.Arrays;
import java.util.HashSet;
import static objects.Constants.Axe;

public class MAIN {
    public static void main(String[] args) {
        Point p = new Point(1.0,1.0);
        FormeGeometrique cercle = new Cercle(new Point(0, 0), 5.5);
        System.out.println("cercle aire = " + cercle.calculerAire() + " perim = " + cercle.calculerPerimetre());
        FormeGeometrique ellipse = new Ellipse(new Point(0, 0), 5, 7);
        System.out.println("Ellipse aire = " + ellipse.calculerAire() + " perim = " + ellipse.calculerPerimetre());
        Ligne ligne = new Ligne(new Point(0, 0), new Point(1, 1));
        System.out.println("Ligne aire = " + ligne.calculerAire() + " perim = " + ligne.calculerPerimetre());
        Ligne ligne2 = new Ligne(new Point(1, 0), new Point(5, 5));
        Ligne ligne3 = new Ligne(new Point(2, 0), new Point(5, 5));
        Ligne testHomothetie = new Ligne(new Point(6,10), new Point(16,8));
        System.out.println(testHomothetie.toString());
        testHomothetie.symetrieAxiale(Axe.ABCISSE);
        System.out.println(testHomothetie.toString());
        FormeGeometrique polygon = new Polygone(new Point(2, 0), new HashSet<>(Arrays.asList(ligne, ligne2, ligne3)));




    }
}
