import objects.*;
import tools.Constants;

import java.util.Arrays;
import java.util.HashSet;

public class MAIN {
    public static void main(String[] args) {
        Ligne ligne = new Ligne(new Point(0, 0), new Point(3, 0));
        Ligne ligne2 = new Ligne(new Point(3, 0), new Point(3, 2));
        Ligne ligne3 = new Ligne(new Point(3, 2), new Point(1, 9));
        Ligne ligne4 = new Ligne(new Point(1, 9), new Point(0, 0));

        FormeGeometrique polygon = new Polygone(new Point(0, 0), new HashSet<>(Arrays.asList(ligne2, ligne3, ligne, ligne4)));


        Ligne l1 = new Ligne(new Point(1, 9), new Point(0, 0));
        Ligne l2 = new Ligne(new Point(0, 0), new Point(3, 0));
        Ligne l3 = new Ligne(new Point(3, 0), new Point(3, 2));
        Ligne l4 = new Ligne(new Point(3, 2), new Point(1, 9));
        FormeGeometrique polygon1 = new Polygone(new Point(1, 1), new HashSet<>(Arrays.asList(l1, l2, l3, l4)));

        Ligne al1 = new Ligne(new Point(1, 9), new Point(0, 0));
        Ligne al2 = new Ligne(new Point(0, 0), new Point(3, 0));
        Ligne al3 = new Ligne(new Point(3, 0), new Point(3, 2));
        Ligne al4 = new Ligne(new Point(3, 2), new Point(1, 9));
        FormeGeometrique polygon2 = new Polygone(new Point(2, 2), new HashSet<>(Arrays.asList(al1, al2, al3, al4)));

        polygon1.homothetie(2);
        polygon2.homothetie(2);

        Image image = new Image();
        image.ajoutFormes(polygon);
        image.ajoutFormes(polygon2);
        image.ajoutFormes(polygon1);
        System.out.println(image.getFormes().toString());
        System.out.println("---------------------------------------------");
        image.changeTrieType(Constants.TriePar.AIRE);
        image.trierParPerimetre();
        System.out.println(image.getFormes().toString());


    }
}
