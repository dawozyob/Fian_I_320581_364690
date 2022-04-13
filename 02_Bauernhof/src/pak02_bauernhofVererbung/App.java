package pak02_bauernhofVererbung;

import pak02_bauernhofVererbung.fauna.Bauer;
import pak02_bauernhofVererbung.fauna.Kuh;
import pak02_bauernhofVererbung.fauna.Saeugetier;
import pak02_bauernhofVererbung.fauna.Schaf;
import pak02_bauernhofVererbung.fauna.Schwein;
import pak02_bauernhofVererbung.flora.Kartoffel;
import pak02_bauernhofVererbung.flora.Moehre;
import pak02_bauernhofVererbung.interfaces.IFressbar;
import pak02_bauernhofVererbung.items.Stein;

public class App {
	public static void main(String[] args) {
		Saeugetier s1 = new Kuh();
		Saeugetier s2 = new Schwein();
		
		s1.fressen();
		s2.fressen();
		/*
		 * Nach Umstellung der Klasse Saeugetier auf eine
		 * abstrakte Klasse kann sie nicht mehr Instanziert werden
		 * 
		 * Cannot instantiate the type Saeugetier
		 */
//		Saeugetier s3 = new Saeugetier();
		
		s1.sprich();
		s2.sprich();
		
		doStuff(new Schaf());
		
		Schwein s3 = new Schwein();
		
		Stein s = new Stein();
		
//		s3.fressen(s);
		
		IFressbar fressbares1 = new Stein();
		IFressbar fressbares2 = new Moehre();
		IFressbar fressbares3 = new Kartoffel();
		
		s3.fressen(fressbares1);
		s3.fressen(fressbares2);
		s3.fressen(fressbares3);
		
	}
	
	public static void doStuff(Saeugetier s) {
		s.fressen();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void demo01() {
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
//		b.fuettern(new Schwein(), new Kartoffel());
	}
	
}
