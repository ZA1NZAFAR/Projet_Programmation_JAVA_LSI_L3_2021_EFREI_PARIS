package objects;

import java.awt.*;

public abstract class FormeGeometrique {
    private Constants.Orientation orientation = Constants.Orientation.DEFAUT;
    private Color color;

    public abstract Double calculerPerimetre();

    public abstract Double calculerAire();

    public void setOrientation(Constants.Orientation orientation) {
        this.orientation = orientation;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
