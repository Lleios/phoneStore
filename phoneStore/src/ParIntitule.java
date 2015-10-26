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
	 * Compare deux articles entrés en paramètres pour les trier par ordre croissant.
	 * Retourne un entier positif, negatif ou nul selon l'ordre entre les deux articles
	 * 
	 * @param a1 Article à comparer
	 * @param a2 Artcile à comparer avec le premier
	 * @return int valeur qui détermine l'ordre
	 */
	public int compare(Article a1, Article a2){
		return a1.getIntitule().compareTo(a2.getIntitule());
	}
	

}
