
import java.util.Comparator;

public class CompareIntitule implements Comparator<Article>{

	public int compare(Article a1, Article a2){
		int resultat = a1.getIntitule().compareToIgnoreCase(a2.getIntitule());
		return resultat;
	}

}
