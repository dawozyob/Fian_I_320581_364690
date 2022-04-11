package bauernhof;

import bauernhof.fauna.Bauer;
import bauernhof.fauna.Hund;

public class App {

	public static void main(String[] args) {
		Bauer b = new Bauer();
				
		String name = "Klaus";		
		int alter = 35;
		
//		b.name = "Klaus";
//		b.alter = 35;
		
		Bauer b1 = new Bauer();
//		b1.name = "Markus";
//		b1.alter = 40;
		
//		System.out.println(b.name);
//		System.out.println(b1.name);
		
		b.setName("Klaus");
		b1.setName("Markus");
		
		System.out.println(b.getName());
		System.out.println(b1.getName());
		
		
		Bauer b2 = new Bauer("Max", 40);
		System.out.println(b2.getName());
		System.out.println(b2.getAlter());
		
		
		Bauer b3 = new Bauer("Christian", -40);
		
		b.sayYourName();
		b1.sayYourName();
		
		/*
		 * Ein Bauer soll die Faehigkeit haben, mit einem
		 * anderen Bauern zu reden.
		 */
		System.out.println(b.getName() + " sagt hallo zu " + b1.getName());
		b.reden(b1.getName()); //Klaus
//		b1.reden();//Markus
		
		b2.sayYourName();
		
		System.out.println(" ----------------------------------- ");
		//---------------------------------------------------------
		Hund h = new Hund("Bello");
		h.laufen();
		
		b.gassigehen(h);
		b.gassigehen(h);
		b.gassigehen(h);
		
		System.out.println(b.getName() + " geht Gassi mit " + h.getName());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
