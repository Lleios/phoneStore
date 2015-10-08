/**
* Classe Accessoire, sous-classe d'Article
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Accessoire extends Article {

	private Set<String> marques;

	/**
	 * 
	 * @param reference
	 * @param intitule
	 * @param prix
	 * @param marques
	 */
	public Accessoire(int reference, String intitule, float prix, Set<String> marques) {
		super(reference, intitule, prix);
		this.marques = marques;
		marques = new HashSet<String>();
	}

	/** Obtenir l'ensemble des marques compatible avec l'accessoire
	 * 
	 * @return ensemble de marques
	 */
	public Set<String> getMarques() {
		return this.marques;
	}

	/** Changer l'ensemble des marques compatible avec l'accessoire
	 * 
	 * @param ensemble de marques
	 */
	public void setMarques(Set<String> marques) {
		this.marques = marques;
	}

	public String toString() {
		return super.toString() + " Telephone compatibles avec : " + this.marques;
	}
	
	public void afficherMarques(){
		Iterator<String> it = this.marques.iterator();
		while( it.hasNext() ){
			System.out.println(it.next());
		}
	}

}