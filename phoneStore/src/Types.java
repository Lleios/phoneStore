/**
* Enumeration des types
*
* @author  Gonnord Kevin, Chcouropat Youri
*/

public enum Types {
	secteur, usb, allume_cigare;
	
	public String toString()
	{
		return super.toString();
	}
	
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