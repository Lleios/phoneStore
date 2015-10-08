import java.util.Comparator;


public class ComparePrix implements Comparator<Article>{

	public int compare(Article a1, Article a2){
		return a1.getPrix() < a2.getPrix() ? -1 : a1.getPrix() == a2.getPrix() ? 0 : 1;
	}
}
