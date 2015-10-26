/**
* Enumération des couleurs
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public enum Couleurs {
	rouge, bleu, vert, noir, orange, jaune, gris, blanc, violet, rose, or;
	
	/**
	 * Méthode qui retourne une valeur de l'énumération sous forme de chaine de caractères
	 * 
	 * @return String
	 */
	public String toString()
	{
		return super.toString();
	}
	
	/**
	 * Méthode qui retourne une couleur si celle donnée en paramètre est contenu dans l'énumération
	 * sinon retourne null
	 * 
	 * @param couleur
	 * @return Couleurs ou null
	 */
	public static Couleurs get(String couleur)
	{
		for (Couleurs c : values()){
			if (couleur.equals(c.toString())){
				return c;
			}
		}
		return null;
	}
}