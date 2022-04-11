package pak02;

public class DemoOverloading {
	public static void main(String[] args) {
		
		//Overloading - Ueberladen
		/*
		 * Ueberladen nennt man das Wiederverwenden von Methodennamen
		 * Die Methoden muessen sich in 
		 * 
		 * Art
		 * Reihenfolge
		 * Anzahl
		 * 
		 * unterscheiden.
		 * 
		 * Ueberladen werden koennen:
		 * Konstruktoren
		 * Methoden
		 */
		go("Markus");
		go("Markus", 1977);
		
		
	}
	
	public static void go(String name) {
		
	}
	
	public static int go(int wert) {
		return 5;
	}
	
//	public static void go(String param) {
//		
//	}
	
	public static void go(String name, int geburtsjahr) {
		
	}
	
	public static void go(int geburtsjahr, String name) {
		
	}
	
	
	
	
}
