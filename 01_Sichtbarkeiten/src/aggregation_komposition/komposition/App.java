package aggregation_komposition.komposition;

public class App {
	public static void main(String[] args) {
		Restaurant r = new Restaurant();
		Stuhl s = new Stuhl(1);
		/*
		 * Anpassung auf Komposition Hier kann keine Stuhlreferenz mehr übergeben
		 * werden.
		 */
//		r.addStuhl(s);
		/*
		 * Sondern nur noch eine Nummer, das Stuhlobjekt wird im Restaurantobjekt
		 * erzeugt.
		 */
		r.addStuhl(1);
		
		/*
		 * Hier erhalten wir nicht Stuhlreferenz, die im Restaurant gekapselt ist,
		 * sondern eine Referenz auf ein neu erzeugtes Objekt.
		 */
		Stuhl s1 = r.getStuhl();
		/*
		 * Damit ergibt dieser Vergleich false
		 */
		System.out.println(s1 == r.stuhl);

	}

}

class Restaurant {
	Stuhl stuhl;

	/*
	 * Anpassung auf Komposition Hier kann keine Stuhlreferenz mehr übergeben
	 * werden.
	 */
	public void addStuhl(int nummer) {
		Stuhl s = new Stuhl(nummer);
		this.stuhl = s;
	}

	/*
	 * Anpassung auf Komposition Hier kann keine Stuhlreferenz mehr das Objekt
	 * verlassen. Es wird die Referenz auf ein neues Objekt zurückgegeben.
	 */
	public Stuhl getStuhl() {
		return new Stuhl(this.stuhl.stuhlnummer);
	}
}

class Stuhl {
	int stuhlnummer;

	public Stuhl(int stuhlnummer) {
		this.stuhlnummer = stuhlnummer;
	}
}
