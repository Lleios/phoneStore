/**
* Classe Coque, sous-classe d
*
* @author  Gonnord Kevin
*/

import java.util.Set;

public class Coque extends Accessoire {

	private Couleur couleur;

	/** Constructeur
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

	public String toString() {
		return super.toString() + " Couleur: " + this.couleur;
	}

}