/**
* Classe ParIntitule
* 
* ParRef implémente l'interface Comparator pour trier les articles par intitule
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Comparator;

public class ParIntitule implements Comparator<Article> {
	
	/**
	 * Constructeur de la classe ParIntitule
	 * 
	 * Le constructeur n'a pas de paramètre
	 */
	public ParIntitule(){
		super();
	}
	
	/**
	 * Compare deux articles entrés en paramètres pour les trier par ordre croissant
	 * 
	 * @param a1
	 * @param a2
	 * @return un entier positif, negatif ou nul selon l'ordre entre les deux articles
	 */
	public int compare(Article a1, Article a2){
		return a1.getIntitule().compareTo(a2.getIntitule());
	}
	

}
