public class Article {

	private int reference;
	private String intitule;
	private float prix;

	/** Constructeur de l'Article initialise les attributs
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

	/**Obtenir l'intitule de l'article
	 * 
	 * @return l'intitule de l'article
	 */
	public String getIntitule() {
		return this.intitule;
	}

	/**Changer l'intitule de l'article
	 * 
	 * @param intitule nouveau intitule de l'article
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	/** Obtenir la reference de l'article
	 * 
	 * @return la reference de l'article
	 */
	public int getReference() {
		return this.reference;
	}

	/** Changer la reference de l'article
	 * 
	 * @param reference nouvelle reference de l'article
	 */
	public void setReference(int reference) {
		this.reference = reference;
	}

	/** Obtenir le prix de l'article
	 * 
	 * @return le prix de l'article
	 */
	public float getPrix() {
		return this.prix;
	}

	/** Changer le prix de l'article
	 * 
	 * @param prix nouveau prix de l'article
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String toString() {
		return "Reference de l'article: " + this.reference + ". Intitulé de l'article: " + this.intitule + 
				". Prix de l'article: " + this.prix + "€.";
	}

}