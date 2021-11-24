package tools;

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

    public enum TriePar {
        PERIMETRE("preimetre"),
        AIRE("aire");
        private final String par;

        TriePar(String par) {
            this.par = par;
        }

        public String toString() {
            return par;
        }
    }
}
