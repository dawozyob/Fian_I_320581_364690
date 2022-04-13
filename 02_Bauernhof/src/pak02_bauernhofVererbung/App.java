package pak02_bauernhofVererbung;

import pak02_bauernhofVererbung.fauna.Bauer;
import pak02_bauernhofVererbung.fauna.Kuh;
import pak02_bauernhofVererbung.fauna.Schwein;
import pak02_bauernhofVererbung.flora.Kartoffel;
import pak02_bauernhofVererbung.flora.Moehre;

public class App {
	public static void main(String[] args) {
		Kuh k = new Kuh();
		Schwein s = new Schwein();
		Bauer b = new Bauer();
		
		b.setName("Markus");
		s.setName("Piggeldy");
		k.setName("Milkakuh");
		
//		b.bewegen();
//		s.bewegen();
//		k.bewegen();
		
		b.fuettern(new Kuh() , new Moehre());
		
		
		
		b.fuettern(new Schwein(), new Kartoffel());
		
		
		
		
	}
}
