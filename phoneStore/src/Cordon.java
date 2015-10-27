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
	 * @param reference reference de l'article
	 * @param intitule intitule nom de l'article
	 * @param prix prix de l'article en euros
	 * @param marques marques de téléphones compatibles avec l'accessoire
	 * @param longueur longueur en cm de du cordon
	 */
	public Cordon(int reference, String intitule, float prix, Set<String> marques, int longueur) {
		super(reference, intitule, prix, marques);
		this.longueur = longueur;
	}

	/** Obtenir la longueur du cordon
	 * 
	 * @return int la longueur du cordon
	 */
	public int getLongueur() {
		return this.longueur;
	}

	/** Changer la logueur du cordon
	 * 
	 * @param longueur la nouvelle longueur du cordon
	 */
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	/**
	 * Retourne l'object Cordon sous la forme d'une chaîne
	 * 
	 * @return String l'object Cordon sous la forme d'une chaîne de caractère
	 */
	public String toString() {
		return super.toString() + "\nLongueur : " + this.longueur +"cm.";
	}
}