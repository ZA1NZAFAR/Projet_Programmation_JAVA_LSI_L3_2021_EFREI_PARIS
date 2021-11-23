import objects.FormeGeometrique;
import objects.Ligne;
import objects.Point;
import objects.Polygone;

import java.util.Arrays;
import java.util.HashSet;

public class MAIN {
    public static void main(String[] args) {
        Ligne ligne = new Ligne(new Point(0, 0), new Point(3, 0));
        Ligne ligne2 = new Ligne(new Point(3, 0), new Point(3, 2));
        Ligne ligne3 = new Ligne(new Point(3, 2), new Point(0, 0));

        FormeGeometrique polygon = new Polygone(new Point(0, 0), new HashSet<>(Arrays.asList(ligne, ligne2, ligne3)));
        System.out.println(polygon.calculerAire());


    }
}
