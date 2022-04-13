package pak02_bauernhofVererbung.fauna;

import pak02_bauernhofVererbung.interfaces.IFressbar;

public class Schaf extends Saeugetier{

	@Override
	public void sprich() {
				
	}

	@Override
	public void fressen() {
		System.out.println("Schaf frisst");
		
	}

	@Override
	public void fressen(IFressbar g) {
		// TODO Auto-generated method stub		
	}

}
