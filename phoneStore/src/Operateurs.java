/**
* Enumeration des opérateurs
*
* @author  Gonnord Kevin
*/

public enum Operateurs {
	SFR, Orange, Free, Sosh, Bouygues;
	
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
	 * Méthode retournant un opérateur s'il correspond a celui donné en paramètre
	 * sinon retourne null
	 * 
	 * @param type
	 * @return Operateurs
	 */
	public static Operateurs get(String operateur)
	{
		for (Operateurs m : values()){
			if (operateur.equals(m.toString())){
				return m;
			}
		}
		return null;
	}
}