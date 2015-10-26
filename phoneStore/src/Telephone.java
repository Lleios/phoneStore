/**
* Classe Telephone, sous-classe d'Article
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public class Telephone extends Article {

	private Operateurs operateur;

	/**
	 * Constructeur de la classe Telephone
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param operateur
	 */
	public Telephone(int reference, String intitule, float prix, Operateurs operateur) {
		super(reference, intitule, prix);
		this.operateur = operateur;
	}
	
	/**
	 * Retourne l'objet Telephone sous la forme d'une chaîne de caractère
	 * 
	 * @return String
	 */
	public String toString() {
		return super.toString()+ " Operateur associé: "+this.operateur;
	}

}