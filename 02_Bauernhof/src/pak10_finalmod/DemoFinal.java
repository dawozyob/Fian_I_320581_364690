package pak10_finalmod;

public class DemoFinal {

	static final String text = "";

	public static void main(String[] args) {
		//final an Variablen bewirkt, dass die Variable nur einmal 
		//einen Wert zugewiesen bekommen kann.
		final int zahl = 100;
//		zahl = 200;
//		text = "W";
	}
}

class A {
	public final void go() {

	}
}

class B extends A {
	//final Methoden koennen nicht ueberschrieben werden
//	public final void go() {
//
//	}
}

final class FinalClass {

}
//von final Klassen kann man nicht erben 
//class B extends FinalClass{
//	
//}
