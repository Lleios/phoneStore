/**
* Classe Coque, sous-classe d'Accessoire
*
*la classe Coque représente les coques en vente
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Set;

public class Coque extends Accessoire {

	private Couleur couleur;

	/** 
	 * Constructeur de la classe Accessoire
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marques
	 * @param couleur
	 */
	public Coque(int reference, String intitule, float prix, Set<String> marques, Couleur couleur) {
		super(reference, intitule, prix, marques);
		this.couleur = couleur;
	}

	/**
	 * Retourne l'objet Coque sous la forme d'une chaïne de caractères
	 * 
	 * @return String
	 */
	public String toString() {
		return super.toString() + " Couleur: " + this.couleur +".";
	}

}