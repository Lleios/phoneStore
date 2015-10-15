/**
* Classe Chargeur, sous-classe d'Accessoire
* 
* la classe Chargeur représente les chargeurs en vente
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Set;

public class Chargeur extends Accessoire {
	
	private Types types;

	/**
	 * Constructeur de la classe Chargeur
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marques
	 * @param types
	 */
	public Chargeur(int reference, String intitule, float prix, Set<String> marques, Types types) {
		super(reference, intitule, prix, marques);
	}

	/**
	 * Retourne l'object Chargeur sous la forme d'une chaïne de caractères
	 * 
	 * @return String
	 */
	public String toString() {
		return super.toString() +"type : " + this.types + ".";
	}

}