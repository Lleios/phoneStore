/**
* Enumeration des types
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public enum Types {
	secteur, usb, allume_cigare;
	
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
	 * Méthode retournant un type s'il correspond a celui donné en paramètre
	 * sinon retourne null
	 * 
	 * @param type
	 * @return
	 */
	public static Types get(String type)
	{
		for (Types m : values()){
			if (type.equals(m.toString())){
				return m;
			}
		}
		return null;
	}
}