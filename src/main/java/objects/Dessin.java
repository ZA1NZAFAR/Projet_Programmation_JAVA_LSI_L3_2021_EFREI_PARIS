package objects;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    List<Image> images;

    public Dessin(List<Image> formes) {
        this.images = formes;
    }

    public Dessin() {
        this.images = new ArrayList<>();
    }


}
