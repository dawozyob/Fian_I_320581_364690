package aggregation_komposition.aggregation;

public class App {
	public static void main(String[] args) {		
		Restaurant r = new Restaurant();		
		Stuhl s = new Stuhl(1);	
		
		/*
		 * Ab hier haben wir zwei Referenzvariablen, die
		 * das selbe Stuhl Objekt referenzieren.
		 */
		r.addStuhl(s);
		/*
		 * Beide Variablen enthalten die selbe Referenz
		 */
		System.out.println(s == r.stuhl);
		
		/*
		 * Wir erhalten die im Restaurantobjekt gekapselte Referenz
		 * und haben somit drei Referenzvariablen, die
		 * das selbe Stuhl Objekt referenzieren.
		 */
		Stuhl s1 = r.getStuhl();
		/*
		 * Auch dieser Vergleich ergibt true
		 */
		System.out.println(s1 == r.stuhl);
			
	}

}

class Restaurant {
	Stuhl stuhl;
	/*
	 * Hier kann von aussen eine Stuhl Referenz übergeben werden
	 */
	public void addStuhl(Stuhl stuhl) {
		this.stuhl = stuhl;
	}
	/*
	 * Hier wird die gekapselte Stuhlreferenz nach aussen gegeben
	 */
	public Stuhl getStuhl() {
		return this.stuhl;
	}

}

class Stuhl {
	int stuhlnummer;
	public Stuhl(int stuhlnummer) {
		this.stuhlnummer = stuhlnummer;
	}
}
