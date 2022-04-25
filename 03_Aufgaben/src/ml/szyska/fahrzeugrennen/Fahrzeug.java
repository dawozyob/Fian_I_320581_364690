package ml.szyska.fahrzeugrennen;


public abstract class Fahrzeug {
	private double position;
	private double geschwindigkeit;
	private int anzahlRaeder;

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	/*
	 * Die Geschwindigkeit des Fahrzeugs kann entsprechend mit Hilfe der Methode
	 * setGeschwindigkeit() festgelegt werden. Die Geschwindigkeit darf die
	 * Maximalgeschwindigkeit nicht überschreiten. Die Maximalgeschwindigkeit des
	 * Fahrzeugs soll mit Hilfe der Methode getMaxGeschwindigkeit() abgefragt werden
	 * können. Für ein Objekt der Klasse Fahrzeug soll die Maximalgeschwindigkeit 0
	 * (Zero) sein.
	 */
	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}

	/*
	 * Die Geschwindigkeit des Fahrzeugs kann entsprechend mit Hilfe der Methode
	 * setGeschwindigkeit() festgelegt werden. Die Geschwindigkeit darf die
	 * Maximalgeschwindigkeit nicht überschreiten.
	 */
	public void setGeschwindigkeit(double geschwindigkeit) {
		if(geschwindigkeit > this.getMaxGeschwindigkeit()) {
			this.geschwindigkeit = this.getMaxGeschwindigkeit();
		}else {
			this.geschwindigkeit = geschwindigkeit;			
		}
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public abstract double getMaxGeschwindigkeit();

	/*
	 * Die Anzahl der Räder soll entsprechend gesetzt und abgefragt werden können.
	 * In der Klasse Fahrzeug soll diese mit 0 initialisiert werden.
	 */
	public Fahrzeug() {
		this.setGeschwindigkeit(0);
		this.setPosition(0);
		this.setAnzahlRaeder(0);

	}

	@Override
	public String toString() {
		return "Fahrzeug [position=" + position + ", geschwindigkeit=" + geschwindigkeit + ", maxGeschwindigkeit="
				+ this.getMaxGeschwindigkeit() + ", anzahlRaeder=" + anzahlRaeder + "]";
	}

	/*
	 * Ein Fahrzeug kann bewegt werden. Legen Sie daher eine Methode bewege an. Die
	 * Methode soll mit einem double-Parameter aufgerufen werden. Beim
	 * Methodenaufruf wird die Zeitdauer (in Minuten) übergeben, mit der sich das
	 * Fahrzeug mit der aktuellen Geschwindigkeit vorwärtsbewegen soll. Der
	 * Methodenaufruf ändert folglich die Position des Fahrzeugs, wenn es mit einer
	 * von 0 abweichenden Geschwindigkeit bewegt wird.
	 */
	public void bewege(double zeitdauer) {
		this.setPosition(this.getPosition() + this.getGeschwindigkeit() / 60 * zeitdauer);
	}

}
