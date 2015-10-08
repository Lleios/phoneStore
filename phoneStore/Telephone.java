/**
* Classe Telephone, sous-classe d'Article
*
* @author  Gonnord Kevin
*/

public class Telephone extends Article {

	private String operateur;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param operateur
	 */
	public Telephone(int reference, String intitule, float prix, Operateur operateur) {
		super(reference, intitule, prix);
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

}