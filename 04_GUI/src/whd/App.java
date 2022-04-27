package whd;

import java.util.ArrayList;

public class App {
	

	// Deklaration
	static int zahl;

	// Initialisierung
	/*
	 * statische Variablen werden Initialisiert, wenn die Klasse geladen wird
	 * Instanzvariablen werden initialisiert, wenn ein Objekt erzeugt wird
	 */
	
	static Person[] personen = new Person[10];
	
	
	public static void main(String[] args) {
		p1.name = "Markus";
		System.out.println(p1.name);

		// Deklaration
		int zahl;
		// Initialisierung
		zahl = 10;

		// Deklaration
		Person person;

		// Initialisierung + Instanzierung
		/*
		 * Der Konstruktor von der Klasse Person wird aufgerufen, initialisiert das Person Objekt und
		 * gibt die Referenz auf das erzeugte Objekt zurueck.
		 * Mit dieser Referenz wird die lokale Variable namens person mit dem Datentyp Person initialisiert.
		 * 
		 */
		person = new Person();

		for(int i = 0;i<personen.length;i++) {
			personen[i] = new Person();
		}
		
		
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		
		for(int i=0;i<2; i++) {	
			p1= new Person();
			list.set(i, p1);
			p2 = new Person();
			list.set(i, p2);
		}
		
	}
	static Person p1, p2;
}

class Person {
	String name;
}