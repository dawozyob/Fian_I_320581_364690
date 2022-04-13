package pak02_bauernhofVererbung.fauna;

public class Kuh extends Saeugetier{
	private int milchmenge;

	public int getMilchmenge() {
		return milchmenge;
	}

	public void setMilchmenge(int milchmenge) {
		this.milchmenge = milchmenge;
	}
	
	public void fressen() {
		System.out.println("Kuh frisst");
	}
	
}
