import objects.Image;
import objects.*;

import java.util.Arrays;
import java.util.HashSet;

public class MAIN {
    public static void main(String[] args) {
        FormeGeometrique cercle = new Cercle(new Point(0, 0), 5.5);
        System.out.println("cercle aire = " + cercle.calculerAire() + " permi = " + cercle.calculerPerimetre());
        FormeGeometrique ellipse = new Ellipse(new Point(0, 0), 5, 7);
        System.out.println("Ellipse aire = " + ellipse.calculerAire() + " permi = " + ellipse.calculerPerimetre());
        Ligne ligne = new Ligne(new Point(0, 0), new Point(5, 5));
        System.out.println("Ligne aire = " + ligne.calculerAire() + " permi = " + ligne.calculerPerimetre());
        Ligne ligne2 = new Ligne(new Point(1, 0), new Point(5, 5));
        Ligne ligne3 = new Ligne(new Point(2, 0), new Point(5, 5));

        FormeGeometrique polygon = new Polygone(new Point(2, 0), new HashSet<>(Arrays.asList(ligne, ligne2, ligne3)));
        System.out.println(polygon.calculerPerimetre());
        Image image = new Image();

        image.ajoutFormes(ligne);
        image.ajoutFormes(ellipse);
        //image.ajoutFormes(polygon);
        System.out.println(image);
        Point deplacement = new Point(1,2);
        Point homothetie = new Point(4,5);

        ligne.symetrieAxiale(new Ligne(new Point(8, 6),new Point(4,10)));
        System.out.println(ligne.toString());

        cercle.translation(deplacement);
        //ligne.homothetie(3,homothetie);
<<<<<<< Updated upstream
      //  System.out.println(ligne.toString());
=======
        //  System.out.println(ligne.toString());
>>>>>>> Stashed changes
        System.out.println(cercle.toString());

    }
}
