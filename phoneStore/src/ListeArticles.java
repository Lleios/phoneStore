/**
* Classe ListeArticles
* 
* La classe ListeArticles représente les articles présent dans le magasin
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
	 * Constructeur initialise la liste d'articles avec une liste vide
	 */
	public ListeArticles() {
		this.listeArticles = new ArrayList<Article>();
	}
	/**
	 * Retourne la liste des articles
	 * 
	 * @return List<Article> la liste des articles
	 */
	public List<Article> getListeArticles() {
		return listeArticles;
	}

	/**
	 * Change la liste des articles avec celle donnée en paramètre
	 * 
	 * @param listeArticles la nouvelle liste des articles
	 */
	public void setListeArticles(List<Article> listeArticles) {
		this.listeArticles = listeArticles;
	}

	/** 
	 * Ajouter des articles dans la liste d'articles
	 * 
	 * @param article l'article à ajouter
	 */
	public void add(Article article) {
		this.listeArticles.add(article);
	}

	/** 
	 * Supprimer un article de la liste des articles
	 * 
	 * @param article l'article à retirer
	 */
	public void delete(Article article) {
		this.listeArticles.remove(article);
	}

	/**
	 * Affichage des articles par tri selon la reference de l'article
	 * 
	 * Utilise la méthode compare(a1,a2) de la classe ParRef
	 */
	public void tousLesArticles_ParRef() {
		Collections.sort(this.listeArticles, new ParRef());
		this.afficher();
	}

	/** 
	 * Affichage des articles par tri selon l'intitule de l'article
	 * 
	 * Utilise la méthode compare(a1,a2) de la classe ParIntitule
	 */
	public void tousLesArticles_ParIntitule() {
		Collections.sort(this.listeArticles, new ParIntitule());
		this.afficher();
	}

	/** 
	 * Affichage des articles par tri selon le prix de l'article
	 * 
	 * Utilise la méthode compare(a1,a2) de la classe ParPrix
	 */
	public void tousLesArticles_ParPrix() {
		Collections.sort(this.listeArticles, new ParPrix());
		this.afficher();
	}
	
	/**
	 * Ecris la liste d'article dans un document texte
	 * 
	 * @param dest le fichier ou sera stocker la liste des articles
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
	 * Vérifie l'uniticité des références dans la liste
	 * 
	 * 
	 * @param reference référence à tester
	 * @return boolean vrai si l'uniticité est vérifiée, faux sinon
	 */
	public boolean uniteRef(int reference){
		boolean unite = true;
		for (Article art : listeArticles){
			if (reference == art.getReference()){
				unite = false;
			}
		}
		return unite;
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
	
	/**
	 * Retourne l'article qui a la référence donnée en paramètre
	 * 
	 * @param reference la référence de l'article recherché
	 * @return Article l'article recherché ou null si non présent
	 */
	public Article trouverArticle(int reference){
		for(Article a: listeArticles){
			if(a.getReference() == reference){
				return a;
			}
		}
		return null;
	}
	
	
}