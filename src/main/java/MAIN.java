import objects.*;
import objects.Image;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MAIN {
    public static void main(String[] args) {
        FormeGeometrique cercle = new Cercle(new Point(0,0),5.5);
        System.out.println("cercle aire = "+cercle.calculerAire()+" permi = "+cercle.calculerPerimetre());
        FormeGeometrique ellipse = new Ellipse(new Point(0,0),5,7);
        System.out.println("Ellipse aire = "+ellipse.calculerAire()+" permi = "+ellipse.calculerPerimetre());
        Ligne ligne = new Ligne(new Point(0,0),new Point(5,5),5.5);
        System.out.println("Ligne aire = "+ligne.calculerAire()+" permi = "+ligne.calculerPerimetre());
        Ligne ligne2 = new Ligne(new Point(1,0),new Point(5,5),5.5);
        Ligne ligne3 = new Ligne(new Point(2,0),new Point(5,5),5.5);

        //FormeGeometrique polygon = new Polygone(Arrays.asList(ligne,ligne2,ligne3));

        Image image = new Image();
        image.ajoutFormes(cercle);
        image.ajoutFormes(ellipse);
        //image.ajoutFormes(polygon);
        System.out.println(image);




    }
}
