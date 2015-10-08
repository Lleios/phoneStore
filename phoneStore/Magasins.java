import java.util.Arrays;
import java.util.HashSet;

/**
* Classe Magasin
*
* @author  Gonnord Kevin
*/

public class Magasins {

	/** Jeu de test pour les classes crée
	 * 
	 * @param args
	 */
	public void main(String[] args) {
		ListeArticles listeArticles = new ListeArticles();
		
		
		Coque co1 = new Coque(17256, "Coque", (float) 12.90, 
				new HashSet<String>(Arrays.asList(new String[] {"Iphone 4", "Iphone 4S"})),
				Couleur.rose);
		
		listeArticles.add(co1);
		
		listeArticles.afficher();
	}

}