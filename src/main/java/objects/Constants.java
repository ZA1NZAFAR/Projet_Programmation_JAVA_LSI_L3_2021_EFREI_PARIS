package objects;

public class Constants {
    public enum Axe {
        ABCISSE("abcisse"),
        ORDONNEE("ordonnee");
        private final String axe;
        Axe(String axe) {
            this.axe = axe;
        }
        public String toString() {
            return axe;
        }
    }
}
