package pak11_klassendiagramm;

public class App {
	public static void main(String[] args) {
		Gast g = new Gast();
		Nahrung n = new Gericht();
		g.essen(n);
		
	}
}
interface Nahrung{
	void wirdGessen();
}

//Use
class Gast{	
	public void essen(Nahrung n) {
		n.wirdGessen();
	}
}

//Realisierung
class Gericht implements Nahrung{
	@Override
	public void wirdGessen() {
		System.out.println("Gericht wird gegessen");		
	}
	
}
