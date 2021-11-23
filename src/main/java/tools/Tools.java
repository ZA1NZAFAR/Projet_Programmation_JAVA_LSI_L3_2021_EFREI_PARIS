package tools;

import objects.Ligne;
import org.locationtech.jts.geom.Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tools {
    public static Coordinate[] linePointsToCoordinates(Set<Ligne> lignes) {
        List<Ligne> temp = new ArrayList<>(lignes);
        List<Coordinate> res = new ArrayList<>();
        for (Ligne ligne : lignes) {
            if (!res.contains(new Coordinate(ligne.getDepart().getX(), ligne.getDepart().getY())))
                res.add(new Coordinate(ligne.getDepart().getX(), ligne.getDepart().getY()));
            if (!res.contains(new Coordinate(ligne.getArrive().getX(), ligne.getArrive().getY()))) {
                res.add(new Coordinate(ligne.getArrive().getX(), ligne.getArrive().getY()));
            }
        }
        res.add(new Coordinate(temp.get(0).getDepart().getX(), temp.get(0).getDepart().getY()));
        return res.stream().toArray(Coordinate[]::new);
    }
}
