/**
* Classe Chargeur, sous-classe d'Accessoire
* 
* la classe Chargeur représente les chargeurs en vente
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Set;

public class Chargeur extends Accessoire {
	
	private Types type;

	/**
	 * Constructeur de la classe Chargeur
	 * 
	 * @param reference reference de l'article
	 * @param intitule intitule nom de l'article
	 * @param prix prix de l'article en euros
	 * @param marques marques compatibles avec l'accessoire
	 * @param types type de chargeur
	 */
	public Chargeur(int reference, String intitule, float prix, Set<String> marques, Types type) {
		super(reference, intitule, prix, marques);
		this.type = type;
	}

	/**
	 * Retourne l'object Chargeur sous la forme d'une chaïne de caractères
	 * 
	 * @return String
	 */
	public String toString() {
		return super.toString() +"type : " + this.type + ".";
	}

}