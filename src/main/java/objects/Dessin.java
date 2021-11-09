package objects;

import java.util.HashSet;
import java.util.Set;

public class Dessin {
    Set<Image> images;

    public Dessin(Set<Image> formes) {
        this.images = formes;
    }

    public Dessin() {
        this.images = new HashSet<>();
    }

}
