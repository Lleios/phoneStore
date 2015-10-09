/**
* Classe Cordon, sous-classe d'Accessoire
*
* @author  Gonnord Kevin
*/

import java.util.Set;

public class Cordon extends Accessoire {

	private int longueur;

	/** Constructeur
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marques
	 * @param longueur
	 */
	public Cordon(int reference, String intitule, float prix, Set<String> marques, int longueur) {
		super(reference, intitule, prix, marques);
		this.longueur = longueur;
	}

	/** Obtenir la longueur du cordon
	 * 
	 * @return longueur
	 */
	public int getLongueur() {
		return this.longueur;
	}

	/** Changer la logueur du cordon
	 * 
	 * @param longueur
	 * 
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public String toString() {
		return super.toString() + " Longueur: " + this.longueur +".";
	}
}