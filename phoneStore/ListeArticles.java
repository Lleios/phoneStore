import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListeArticles{

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
		Comparator<Article> c = new CompareReference();
		Collections.sort(this.listeArticles);
		this.afficher();
	}

	/** Affichage des articles par tri selon l'intitule de l'article
	 * 
	 */
	public void tousLesArticles_ParIntitule() {
		Comparator<Article> c = new CompareIntitule();
		Collections.sort(this.listeArticles);
		this.afficher();
	}

	/** Affichage des articles par tri selon le prix de l'article
	 * 
	 */
	public void tousLesArticles_ParPrix() {
		Comparator c = new ComparePrix();
		Collections.sort(this.listeArticles);
		this.afficher();
	}
	
	/** Afficher les articles de la liste d'articles
	 * 
	 */
	public void afficher(){
		//On parcours la liste d'articles
		for(Article a : listeArticles){
			//On affiche l'article qui utilisera la fonction toString pour l'afficher
			System.out.println(a);
		}
	}

}