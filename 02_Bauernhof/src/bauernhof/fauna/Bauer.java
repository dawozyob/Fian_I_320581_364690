package bauernhof.fauna;

public class Bauer {
	//Attribute
	/*
	 * Ein Objekt speichert/kapselt Informationen/Daten
	 * in seinen Attributen.
	 */
	private String name;
	private int alter;
	
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
		this("Standardname", 20);
		/*
		 * this ohne Klammer ist eine Referenz auf das ausfuehrende Objekt
		 */
		this.setName("Standardname");		
	}
	
	public Bauer(String name, int alter) {
		this.setName(name);
		this.setAlter(alter);
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
	
}
