import objects.*;

import java.util.Arrays;
import java.util.HashSet;

public class MAIN {
    public static void main(String[] args) {
        Ligne ligne4 = new Ligne(new Point(1, 9), new Point(0, 0));
        Ligne ligne = new Ligne(new Point(0, 0), new Point(3, 0));
        Ligne ligne2 = new Ligne(new Point(3, 0), new Point(3, 2));
        Ligne ligne3 = new Ligne(new Point(3, 2), new Point(1, 9));

        FormeGeometrique polygon = new Polygone(new Point(0, 0), new HashSet<>(Arrays.asList(ligne2, ligne3, ligne, ligne4)));
        FormeGeometrique polygonGr = polygon;
        FormeGeometrique polygonPlGr = polygonGr;
        polygonGr.homothetie(2);
        polygonPlGr.homothetie(2);


        Image image = new Image();
        image.ajoutFormes(polygonGr);
        image.ajoutFormes(polygonPlGr);
        image.ajoutFormes(polygon);
        System.out.println(image.getFormes().toString());
        System.out.println("---------------------------------------------");
        image.trierParPerimetre();
        System.out.println(image.getFormes().toString());


    }
}
