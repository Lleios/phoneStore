/**
* Classe Article
* 
* La classe Article représente un article à la vente
*
* @author  Gonnord Kevin, Chcouropat Youri
*/
public class Article {

	private int reference;
	private String intitule;
	private float prix;

	/** 
	 * Constructeur de l'Article initialise les attributs
	 * 
	 * @param reference reference de l'article
	 * @param intitule intitule nom de l'article
	 * @param prix prix de l'article en euros
	 */
	public Article(int reference, String intitule, float prix) {
		this.reference = reference;
		this.intitule = intitule;
		this.prix = prix;
	}

	/**
	 * Obtenir l'intitule de l'article
	 * 
	 * @return String l'intitule de l'article
	 */
	public String getIntitule() {
		return this.intitule;
	}

	/**
	 * Changer l'intitule de l'article
	 * 
	 * @param intitule le nouvel intitule de l'article
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/** 
	 * Obtenir la reference de l'article
	 * 
	 * @return int la référence de l'article
	 */
	public int getReference() {
		return this.reference;
	}

	/** 
	 * Changer la référence de l'article
	 * 
	 * @param reference la nouvelle référence de l'article
	 */
	public void setReference(int reference) {
		this.reference = reference;
	}

	/** 
	 * Obtenir le prix de l'article 
	 * 
	 * @return float le prix de l'article
	 */
	public float getPrix() {
		return this.prix;
	}

	/** 
	 * Changer le prix de l'article
	 * 
	 * @param prix le nouveau prix de l'article
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	/**
	 * Retourne l'objet Article sous la forme d'une chaîne de caractères
	 * 
	 * @return String l'objet Article sous la forme d'une chaîne de caractères
	 */
	public String toString() {
		return "Reference de l'article : " + this.reference + "\nIntitulé de l'article : " + this.intitule + 
				"\nPrix de l'article : " + this.prix + "€";
	}
	
}