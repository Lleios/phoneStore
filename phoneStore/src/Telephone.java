/**
* Classe Telephone, sous-classe d'Article
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public class Telephone extends Article {

	private Operateur operateur;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param operateur
	 */
	public Telephone(int reference, String intitule, float prix, Operateur operateur) {
		super(reference, intitule, prix);
		this.operateur = operateur;
	}

	public String toString() {
		return super.toString();
	}

}