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
	 * @param reference la référence de l'article
	 * @param intitule le nom de l'article
	 * @param prix le prix de l'article en euros
	 * @param operateur le nom de l'opérateur 
	 */
	public Telephone(int reference, String intitule, float prix, Operateurs operateur) {
		super(reference, intitule, prix);
		this.operateur = operateur;
	}
	
	/**
	 * Retourne l'objet Telephone sous la forme d'une chaîne de caractère
	 * 
	 * @return String l'object Telephone sous la forme d'une chaïne de caractères
	 */
	public String toString() {
		return super.toString()+ "\nOperateur associé : "+this.operateur;
	}

}