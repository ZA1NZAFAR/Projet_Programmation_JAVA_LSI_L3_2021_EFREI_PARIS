package objects;

public class Constants {
    public enum Orientation {
        DEFAUT("defaut"),
        INVERSE("inverse"),
        HORIZONTAL_G("horizontal_g"),
        HORIZONTAL_D("horizontal_d");

        private final String orientation;

        Orientation(String marque) {
            this.orientation = marque;
        }

        public String toString() {
            return orientation;
        }
    }
}
