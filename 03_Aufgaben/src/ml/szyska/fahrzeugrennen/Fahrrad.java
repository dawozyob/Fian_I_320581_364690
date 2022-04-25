package ml.szyska.fahrzeugrennen;

public class Fahrrad  extends Fahrzeug{
	
	@Override
	public double getMaxGeschwindigkeit() {
		return 30;
	}
	
	public Fahrrad() {
		this.setAnzahlRaeder(2);
		
	}
}
