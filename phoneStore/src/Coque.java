/**
* Classe Coque, sous-classe d'Accessoire
*
*la classe Coque représente les coques en vente
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Set;

public class Coque extends Accessoire {

	private Couleurs couleur;

	/** 
	 * Constructeur de la classe Accessoire
	 * 
	 * @param reference reference de l'article
	 * @param intitule intitule nom de l'article
	 * @param prix prix de l'article en euros
	 * @param marques marques de téléphones compatibles avec l'accessoire
	 * @param couleur couleur de la coque
	 */
	public Coque(int reference, String intitule, float prix, Set<String> marques, Couleurs couleur) {
		super(reference, intitule, prix, marques);
		this.couleur = couleur;
	}

	/**
	 * Retourne l'objet Coque sous la forme d'une chaïne de caractères
	 * 
	 * @return String l'object Coque sous la forme d'une chaîne de caractères
	 */
	public String toString() {
		return super.toString() + " Couleur: " + this.couleur +".";
	}

}