package pak01_bauernhof.fauna;

import pak01_bauernhof.flora.Karotte;

public class Schwein {
	private String name;
	private int gewicht;
	private int alter;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public Schwein() {
		this("Standardschwein", 250, 5);
	}

	public Schwein(String name, int gewicht, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
	}

	public void fressen(Karotte karotte) {
		System.out.println("Schwein frisst Karotte");
		this.setGewicht(karotte.wirdGegessen());
	}

}
