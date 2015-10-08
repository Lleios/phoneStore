/**
* Classe Chargeur, sous-classe d'Accessoire
*
* @author  Gonnord Kevin
*/

import java.util.Set;

public class Chargeur extends Accessoire {

	/**
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

	public String toString() {
		return super.toString();
	}

}