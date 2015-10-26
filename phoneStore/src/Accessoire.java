/**
* Classe Accessoire, sous-classe d'Article
* 
* La classe Accessoire représente les différents accésssoire en vente
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Accessoire extends Article {

	private Set<String> marques;

	/**
	 * Constructeur de la classe Accessoire
	 * 
	 * @param reference la référence de l'article
	 * @param intitule le nom de l'article
	 * @param prix le prix de l'article
	 * @param marques
	 */
	public Accessoire(int reference, String intitule, float prix, Set<String> marques) {
		super(reference, intitule, prix);
		this.marques = marques;
		marques = new HashSet<String>();
	}

	/** 
	 * Obtenir l'ensemble des marques compatibles avec l'accessoire
	 * 
	 * @return HashSet<String>
	 */
	public Set<String> getMarques() {
		return this.marques;
	}

	/** 
	 * Change l'ensemble des marques compatibles avec l'accessoire
	 * 
	 * @param marques
	 */
	public void setMarques(Set<String> marques) {
		this.marques = marques;
	}

	/**
	 * Retourne l'objet Accessoire sous la forme d'une chaïne de caractères
	 * 
	 * @return String
	 */
	public String toString() {
		return super.toString() + " Telephone compatibles avec : " + this.marques;
	}
	
	/**
	 * Affiche la liste des marques compatibles avec l'accessoire
	 */
	public void afficherMarques(){
		Iterator<String> it = this.marques.iterator();
		while( it.hasNext() ){
			System.out.println(it.next());
		}
	}

}