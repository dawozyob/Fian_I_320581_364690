package pak01_bauernhof.fauna;

public class Kuh {
	
	//Attribute
	private String name;
	private int gewicht;
	private int alter;
	private int milchmenge;
	
	//Getter/Setter
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
	public int getMilchmenge() {
		return milchmenge;
	}
	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}
	
	public Kuh() {
		this("Standardkuh", 500, 5, 100);
	}
	
	public Kuh(String name, int gewicht, int alter, int milchmenge) {
		this.setName(name);
		this.setGewicht(gewicht);
		this.setAlter(alter);
		this.setMilchmenge(milchmenge);
	}
	
	public int wirdgemolken() {
		int tmp = this.getMilchmenge();
		this.setMilchmenge(0);
		return tmp;
	}
}
