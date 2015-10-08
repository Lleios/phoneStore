import java.util.Comparator;


public class CompareReference implements Comparator<Article>{

	public int compare(Article a1, Article a2) {
		return a1.getReference() < a2.getReference() ? -1 : a1.getReference() == a2.getReference() ? 0 : 1;
	}
}
