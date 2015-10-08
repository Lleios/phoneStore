public class Article {

	private string reference;
	private string intitule;
	private float prix;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 */
	public Article(string reference, string intitule, float prix) {
		// TODO - implement Article.Article
		throw new UnsupportedOperationException();
	}

	public string getIntitule() {
		return this.intitule;
	}

	/**
	 * 
	 * @param intitule
	 */
	public void setIntitule(string intitule) {
		this.intitule = intitule;
	}

	public string getReference() {
		return this.reference;
	}

	/**
	 * 
	 * @param reference
	 */
	public void setReference(string reference) {
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

	public void toString() {
		// TODO - implement Article.toString
		throw new UnsupportedOperationException();
	}

}