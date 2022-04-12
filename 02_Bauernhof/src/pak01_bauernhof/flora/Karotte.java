package pak01_bauernhof.flora;

public class Karotte {
	private String sorte;
	private int ruebenlaenge;
	
	public String getSorte() {
		return sorte;
	}
	public void setSorte(String sorte) {
		this.sorte = sorte;
	}
	public int getRuebenlaenge() {
		return ruebenlaenge;
	}
	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
	}
	
	public Karotte() {
		this("Standardkarotte", 10);
	}
	public Karotte(String sorte, int ruebenlaenge) {
		this.setSorte(sorte);
		this.setRuebenlaenge(ruebenlaenge);
	}
	
	public int wirdGegessen() {
		System.out.println("Karotte wird gegessen");
		int tmp = this.getRuebenlaenge();
		this.setRuebenlaenge(tmp);
		return tmp;
	}
	
}
