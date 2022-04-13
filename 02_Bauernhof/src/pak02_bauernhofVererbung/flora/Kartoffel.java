package pak02_bauernhofVererbung.flora;

public class Kartoffel extends Gemuese {
	private int knollengroesse;

	public int getKnollengroesse() {
		return knollengroesse;
	}

	public void setKnollengroesse(int knollengroesse) {
		this.knollengroesse = knollengroesse;
	}

	public Kartoffel() {
		this("Standardkartoffel", 10);
	}
	public Kartoffel(String sorte, int knollengroesse) {
		super(sorte);
		this.setKnollengroesse(knollengroesse);
	}

	@Override
	public void wirdgefressen() {
		System.out.println("Kartoffel wird gefressen");
		
	}

}
