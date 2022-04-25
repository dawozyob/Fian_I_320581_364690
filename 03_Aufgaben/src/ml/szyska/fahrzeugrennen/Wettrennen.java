package ml.szyska.fahrzeugrennen;

public class Wettrennen {
	private Fahrzeug[] rennteilnehmer;

	public Fahrzeug[] getRennteilnehmer() {
		return rennteilnehmer;
	}

	public void setRennteilnehmer(Fahrzeug[] rennteilnehmer) {
		this.rennteilnehmer = rennteilnehmer;
	}

	public Wettrennen(Fahrzeug[] rennteilnehmer) {
		this.setRennteilnehmer(rennteilnehmer);
	}
	
	public void doRace() {
		getRennteilnehmer()[0].setGeschwindigkeit(20);
		getRennteilnehmer()[1].setGeschwindigkeit(150);
		getRennteilnehmer()[2].setGeschwindigkeit(140);
		getRennteilnehmer()[3].setGeschwindigkeit(200);
		
		getRennteilnehmer()[0].bewege(240);
		
		for(Fahrzeug f : getRennteilnehmer()) {
			f.bewege(60);
			System.out.println(f);
		}
	}
}
