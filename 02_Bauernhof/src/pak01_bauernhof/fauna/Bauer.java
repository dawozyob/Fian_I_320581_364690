package pak01_bauernhof.fauna;

import pak01_bauernhof.flora.Karotte;

public class Bauer {
	
	//Attribute
	/*
	 * Ein Objekt speichert/kapselt Informationen/Daten
	 * in seinen Attributen.
	 */
	private String name;
	private int alter;
	private int gewicht;
	
	//Getter/Setter
	public int getGewicht() {
		return this.gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}		
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		if(alter < 0) {
			System.out.println("Alter darf keinen negativen Wert enthalten");
			this.alter = alter * -1;
		}else {
			this.alter = alter;			
		}
	}
	//Konstruktoren
	/*
	 * Dienen der Objekterzeugung und werden
	 * jedes mal aufgerufen, wenn mit dem new Operator 
	 * ein Objekt erzeugt wird
	 */
	public Bauer() {
		/*
		 * this() mit Klammer ruft einen eigenen anderen Konstruktor auf
		 */
		this("Standardname", 20, 75);
		/*
		 * this ohne Klammer ist eine Referenz auf das ausfuehrende Objekt
		 */
		this.setName("Standardname");
		this.setAlter(20);
		this.setGewicht(75);
	}
	
	public Bauer(String name, int alter, int gewicht) {
		this.setName(name);
		this.setAlter(alter);
		this.setGewicht(gewicht);
	}
	
	//Methoden
	/*
	 * Die Methoden sind das Verhalten einer Klasse
	 */
	
	public void sayYourName() {
		System.out.println(this.getName());
	}
	
	public void reden(String name) {
		System.out.println(this.getName() + " sagt hallo " + name);
	}
	
	public void gassigehen(Hund hund) {
		//Hier soll die Methode laufen() eines Hundes ausgefuehrt werden
//		Hund h = new Hund();
//		h.laufen();		
		hund.laufen();		
	}
	
	public void melken(Kuh kuh) {
		System.out.println("Kuh wird gemolken");
		int gemolkeneMilch = kuh.wirdgemolken();
		System.out.println("Der Bauer hat " +  gemolkeneMilch + " l Milch gemolken");
	}
	
	public void schweinFuettern(Schwein schwein, Karotte karotte) {
		System.out.println("Bauer fuettert Schwein");
		schwein.fressen(karotte);
	}
	
	
}
