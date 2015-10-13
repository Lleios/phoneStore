/**
* Classe ListeArticles
* 
* La classe ListeArticles, représente les articles présent dans le magasin
*
* @author  Gonnord Kevin, Chcouropat Youri
*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListeArticles{

	private List<Article> listeArticles;

	/** 
	 * Constructeur initialise la liste d'articles
	 */
	public ListeArticles() {
		this.listeArticles = new ArrayList<Article>();
	}

	/** 
	 * Ajouter des articles dans la liste d'articles
	 * 
	 * @param article à ajouter dans la liste
	 */
	public void add(Article article) {
		this.listeArticles.add(article);
	}

	/** 
	 * Supprimer un article de la liste des articles
	 * 
	 * @param article à supprimmer de la liste
	 */
	public void delete(Article article) {
		this.listeArticles.remove(article);
	}

	/**
	 * Affichage des articles par tri selon la reference de l'article
	 */
	public void tousLesArticles_ParRef() {
		Collections.sort(this.listeArticles, new ParRef());
		this.afficher();
	}

	/** Affichage des articles par tri selon l'intitule de l'article
	 * 
	 */
	public void tousLesArticles_ParIntitule() {
		Collections.sort(this.listeArticles, new ParIntitule());
		this.afficher();
	}

	/** 
	 * Affichage des articles par tri selon le prix de l'article
	 */
	public void tousLesArticles_ParPrix() {
		Collections.sort(this.listeArticles, new ParPrix());
		this.afficher();
	}
	
	/**
	 * Ecris la liste d'article dans un document texte
	 */
	public void sauvegarde(String dest){
		try{
		FileWriter fw = new FileWriter(dest);
			for (Article a : this.listeArticles){
				fw.write(a.toString(), 0, a.toString().length());
			}
			fw.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}	
	}
	
	/** 
	 * Afficher les articles de la liste d'articles
	 */
	public void afficher(){
		//On vérifie si la liste d'article est vide
		if(listeArticles.isEmpty()){
			System.out.println("La liste est vide !");
		}else{
			//On parcours la liste d'articles
			for(Article a : listeArticles){
				//On affiche l'article qui utilisera la fonction toString pour l'afficher
				System.out.println(a);
			}
		}
	}
	
	public Article trouverArticle(int reference){
		for(Article a: listeArticles){
			if(a.getReference() == reference){
				return a;
			}
		}
		return null;
	}
}