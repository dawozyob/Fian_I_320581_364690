package pak02_bauernhofVererbung.fauna;

import pak02_bauernhofVererbung.interfaces.IFressbar;

public abstract class Saeugetier {
	private String name;
	private int alter;
	private int gewicht;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public Saeugetier() {
		this("Standardname", 50, 5);
	}

	public Saeugetier(String name, int gewicht, int alter) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
	}

	public void bewegen() {
		System.out.println("Saeugetier bewegt sich");
	}

	public abstract void fressen();

	public abstract void fressen(IFressbar g);
	
	public abstract void sprich();
}
