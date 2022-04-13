package pak02_bauernhofVererbung.fauna;

import pak02_bauernhofVererbung.interfaces.IFressbar;

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

	@Override
	public void sprich() {
		System.out.println("Muuuuuhhhhh");	
	}

	@Override
	public void fressen(IFressbar g) {
		// TODO Auto-generated method stub
		
	}
	
}
