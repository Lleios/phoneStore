import java.util.ArrayList;
import java.util.List;

public class ListeArticles {

	private List<Article> listeArticles;

	/** Constructeur initialise la liste d'articles
	 * 
	 */
	public ListeArticles() {
		this.listeArticles = new ArrayList<Article>();
	}

	/** Ajouter des articles dans la liste d'articles
	 * 
	 * @param article à ajouter dans la liste
	 */
	public void add(Article article) {
		this.listeArticles.add(article);
	}

	/** Supprimer un article de la liste des articles
	 * 
	 * @param article à supprimmer de la liste
	 */
	public void delete(Article article) {
		this.listeArticles.remove(article);
	}

	/** Affichage des articles par tri selon la reference de l'article
	 * 
	 */
	public void tousLesArticles_ParRef() {
		
	}

	/** Affichage des articles par tri selon l'intitule de l'article
	 * 
	 */
	public void tousLesArticles_ParIntitule() {
		// TODO - implement ListeArticles.tousLesArticles_ParIntitule
		throw new UnsupportedOperationException();
	}

	/** Affichage des articles par tri selon le prix de l'article
	 * 
	 */
	public void tousLesArticles_ParPrix() {
		// TODO - implement ListeArticles.tousLesArticles_ParPrix
		throw new UnsupportedOperationException();
	}

}