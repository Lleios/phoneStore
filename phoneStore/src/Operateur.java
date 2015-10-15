/**
* Enumeration des opérateurs
*
* @author  Gonnord Kevin
*/

public enum Operateur {
	SFR, Orange, Free, Sosh, Bouygues;
	
	public String toString()
	{
		return super.toString();
	}
	
	public static Operateur get(String operateur)
	{
		for (Operateur m : values()){
			if (operateur.equals(m.toString())){
				return m;
			}
		}
		return null;
	}
}