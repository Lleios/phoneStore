/**
* Classe ParRef
* 
* ParRef implémente l'interface Comparator pour trier les articles par référence
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.Comparator;

public class ParRef implements Comparator<Article> {

	/**
	 * Constructeur par defaut
	 *
	 */
	public ParRef(){
		super();
	}
	
	/**
	 * Compare deux articles entrés en paramètres pour les trier par ordre croissant
	 * Retourne un entier positif, negatif ou nul selon l'ordre entre les deux articles
	 * 
	 * @param a1
	 * @param a2
	 * @return int
	 */
	public int compare(Article a1, Article a2){
		if ( a1.getReference() == a2.getReference()){
			return 0;
		}
		else{
			if ( a1.getReference() < a2.getReference()){
				return -1;
			}
			else{
				return 1;
			}
		}
	}
	
}
