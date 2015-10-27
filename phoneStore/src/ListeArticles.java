/**
* Classe ListeArticles
* 
* La classe ListeArticles représente les articles présent dans le magasin
*
* @author  Gonnord Kevin, Chcouropat Youri
*/
import java.io.BufferedWriter;
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
	public String tousLesArticles_ParRef() {
		Collections.sort(this.listeArticles, new ParRef());
		return this.toString();
	}

	/** 
	 * Affichage des articles par tri selon l'intitule de l'article
	 * 
	 * Utilise la méthode compare(a1,a2) de la classe ParIntitule
	 */
	public String tousLesArticles_ParIntitule() {
		Collections.sort(this.listeArticles, new ParIntitule());
		return this.toString();
	}

	/** 
	 * Affichage des articles par tri selon le prix de l'article
	 * 
	 * Utilise la méthode compare(a1,a2) de la classe ParPrix
	 */
	public String tousLesArticles_ParPrix() {
		Collections.sort(this.listeArticles, new ParPrix());
		return this.toString();
	}
	
	/**
	 * Ecris la liste d'article dans un document texte
	 * 
	 * @param dest le fichier ou sera stocker la liste des articles
	 */
	public void sauvegarde(String dest){
		try{
		FileWriter fw = new FileWriter(dest);
		// Utilisation de bufferedWirter pour appeler la méthode newLine()
		BufferedWriter bw = new BufferedWriter(fw);
		// Séparer la chaine en plusieurs sous chaine 
		// car \n ne permet pas de sauter de ligne à l'écriture dans le fichier
		String[] parts = this.toString().split("\n");
		for(int i = 0; i < parts.length; i++){
			bw.write(parts[i]);
			// newLine() permet le saut de ligne
			bw.newLine();
		}
		bw.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}	
	}
	
	/**
	 * Vérifie l'uniticité des références dans la liste
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
	public String toString(){
		String resultat = "";
		//On vérifie si la liste d'article est vide
		if(listeArticles.isEmpty()){
			resultat="Il n'y a aucun article en vente";
		}else{
			resultat = "LISTE DES ARTICLES EN VENTES\n";
			//On parcours la liste d'articles
			for(Article a : listeArticles){
				//On affiche l'article qui utilisera la fonction toString pour l'afficher
				resultat = resultat + a.toString() + "\n******************************************************";
			}
		}
		return resultat;
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