package pak02_bauernhofVererbung.flora;

public class Moehre extends Gemuese {

	private int ruebenlaenge;

	public int getRuebenlaenge() {
		return ruebenlaenge;
	}

	public void setRuebenlaenge(int ruebenlaenge) {
		this.ruebenlaenge = ruebenlaenge;
	}

	public Moehre() {
		this("Standardmoehre", 10);
	}

	public Moehre(String sorte, int ruebenlange) {
		super(sorte);
		this.setRuebenlaenge(ruebenlange);
	}
	
	@Override
	public void wirdgegessen() {
		System.out.println("Moehre wird gegessen");
	}
}
