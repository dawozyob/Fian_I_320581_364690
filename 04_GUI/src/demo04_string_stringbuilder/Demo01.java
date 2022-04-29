package demo04_string_stringbuilder;

public class Demo01 {
	public static void main(String[] args) {
		String s = "Hallo";
//		System.out.println(s + " Welt"); // Hallo Welt
//		System.out.println(s);			 //Hallo
		
		System.out.println(s.toUpperCase()); //HALLO
		System.out.println(s); //Hallo
		
		/*
		 * Alle Methoden von String, die einen String veraendern
		 * geben einen neuen String zurueck
		 */
		s.concat(" Welt");
		System.out.println(s); //Hallo
		//Die Referenz auf den geaenderten String muss entgegengenommen werden
		s = s.concat(" Welt");
		System.out.println(s); //Hallo Welt
		
		
		
		
		//StringBuilder ist mutable - veraenderbar
		StringBuilder sb = new StringBuilder("Hallo");
		sb.append(" Welt");
		System.out.println(sb); //Hallo Welt
		
	}
}
