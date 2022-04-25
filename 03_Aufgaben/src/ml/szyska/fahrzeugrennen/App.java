package ml.szyska.fahrzeugrennen;

public class App {
	public static void main(String[] args) {
			
		Fahrrad f1 = new Fahrrad();
		Auto a1 = new Auto();
		Krankenwagen k1 = new Krankenwagen();
		Rennwagen r1 = new Rennwagen();
		
		System.out.println(f1);
		System.out.println(a1);
		System.out.println(k1);
		System.out.println(r1);
		
		System.out.println("-------------- Wettrennen ------------------");
		
		f1.setGeschwindigkeit(20);
		a1.setGeschwindigkeit(150); //Wird vom Setter auf 140 begrenzt
		k1.setGeschwindigkeit(140);
		r1.setGeschwindigkeit(200);
		
		f1.bewege(240);
		
		f1.bewege(60);
		a1.bewege(60);
		k1.bewege(60);
		r1.bewege(60);
		
		System.out.println(f1.getPosition());
		System.out.println(a1.getPosition());
		System.out.println(k1.getPosition());
		System.out.println(r1.getPosition());
		
		Fahrzeug[] fahrzeuge = {new Fahrrad(), new Auto(), new Krankenwagen(), new Rennwagen()};
		fahrzeuge[0].setGeschwindigkeit(20);
		fahrzeuge[1].setGeschwindigkeit(150);
		fahrzeuge[2].setGeschwindigkeit(140);
		fahrzeuge[3].setGeschwindigkeit(200);
		
		fahrzeuge[0].bewege(240);
		
		for(Fahrzeug f : fahrzeuge) {
			f.bewege(60);
			System.out.println(f);
		}
		System.out.println("-------------------------------");
		Wettrennen rennen = new Wettrennen(new Fahrzeug[]{new Fahrrad(), new Auto(), new Krankenwagen(), new Rennwagen()});
		rennen.doRace();
	
	}
}
