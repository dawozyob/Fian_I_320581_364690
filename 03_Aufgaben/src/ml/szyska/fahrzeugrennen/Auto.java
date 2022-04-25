package ml.szyska.fahrzeugrennen;

public class Auto  extends Fahrzeug{
	
	@Override
	public double getMaxGeschwindigkeit() {	
		return 140;
	}
	public Auto() {
		this.setAnzahlRaeder(4);
		
	}
}
