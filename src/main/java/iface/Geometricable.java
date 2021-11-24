package iface;

import tools.Constants;
import objects.Point;

public interface Geometricable {
    /***
     * Calcule le périmètre d'un forme geometrique
     * @return la valeur mathématique du calcul du périmètre
     */
    double calculerPerimetre();

    /***
     * Calcule l'aire d'un forme geometrique
     * @return la valeur mathématique du calcul du périmètre
     */
    double calculerAire();

    /***
     * Fait la translation d'un forme geometrique vers un point donné
     * @param deplacement le point où le centre du cercle va se diriger
     */
    void translation(Point deplacement);

    /***
     * Fait l'homothétie d'un forme geometrique avec une valeur
     * @param valeur le rapport de l'homothétie
     */
    void homothetie(double valeur);

    /***
     * Fait la symétrie axiale selon un axe donnée
     * @param axe l'axe où la symétrie axiale sera faite
     */
    void symetrieAxiale(Constants.Axe axe);

    /***
     * Fait la symétrie axiale selon l'origine
     */
    void symetrieCentrale();

    /***
     * Permet de changer la critere de trie i.e Trie par l'aire ou trie par perimetre
     */
    void changeTrieType(Constants.TriePar par);

    /***
     * Permet de rotater par un angle
     * @param angle angle de rotation
     */
    void rotate(int angle);
}
