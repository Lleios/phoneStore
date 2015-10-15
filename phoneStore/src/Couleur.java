/**
* Enumération des couleurs
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public enum Couleur {
	rouge, bleu, vert, noir, orange, jaune, gris, blanc, violet, rose, or;
	
	public String toString()
	{
		return super.toString();
	}
	
	public static Couleur get(String couleur)
	{
		for (Couleur m : values()){
			if (couleur.equals(m.toString())){
				return m;
			}
		}
		return null;
	}
}