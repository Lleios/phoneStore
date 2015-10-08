public class Article {

	private String reference;
	private String intitule;
	private float prix;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 */
	public Article(String reference, String intitule, float prix) {
		// TODO - implement Article.Article
		throw new UnsupportedOperationException();
	}

	public String getIntitule() {
		return this.intitule;
	}

	/**
	 * 
	 * @param intitule
	 */
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getReference() {
		return this.reference;
	}

	/**
	 * 
	 * @param reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	public float getPrix() {
		return this.prix;
	}

	/**
	 * 
	 * @param prix
	 */
	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String toString() {
		// TODO - implement Article.toString
		throw new UnsupportedOperationException();
	}

}