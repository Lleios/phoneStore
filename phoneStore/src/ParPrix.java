/**
* Classe ParRef
* 
* ParRef implémente l'interface Comparator pour trier les articles par prix
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Comparator;

public class ParPrix implements Comparator<Article> {

	/**
	 * Constructeur de la classe ParPrix
	 * 
	 * Le constructeur n'a pas de paramètre
	 */
	public ParPrix(){
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
		if ( a1.getPrix() == a2.getPrix()){
			return 0;
		}
		else{
			if ( a1.getPrix() < a2.getPrix()){
				return -1;
			}
			else{
				return 1;
			}
		}
	}
	

}
