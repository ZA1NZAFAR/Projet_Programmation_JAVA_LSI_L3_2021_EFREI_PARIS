package objects;

import iface.Geometricable;

import static tools.Constants.TriePar;

public abstract class FormeGeometrique implements Comparable<FormeGeometrique>, Geometricable {
    private int angle;
    private TriePar triePar = TriePar.PERIMETRE;

    @Override
    public void rotate(int angle) {
        this.angle += angle;
        while (this.angle > 360) this.angle -= 360;
        while (this.angle < 0) this.angle += 360;
        if (this.angle % 360 == 0) this.angle = 0;
    }

    public void changeTrieType(TriePar par) {
        triePar = par;
    }

    /***
     * implementation du l'interface comparable
     * Permet de comparer les périmètres de 2 cercles
     * @param other cercle o à comparer avec le cercle actuel
     * @return 0 si le périmètre/aire est égale
     * @return -1 si le périmètre/aire du cercle est inférieur au cercle mis en paramètre
     * @return 1 si le périmètre/aire de notre cercle est supérieur au cercle o mis en paramètre
     */
    @Override
    public int compareTo(FormeGeometrique other) {
        switch (this.triePar) {
            case AIRE:
                return Double.compare(this.calculerPerimetre(), other.calculerPerimetre());
            case PERIMETRE:
                return Double.compare(this.calculerAire(), other.calculerAire());
            default:
                throw new IllegalArgumentException();
        }
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public TriePar getTriePar() {
        return triePar;
    }

    public void setTriePar(TriePar triePar) {
        this.triePar = triePar;
    }
}
