package pak02_bauernhofVererbung.fauna;

import pak02_bauernhofVererbung.flora.Gemuese;
import pak02_bauernhofVererbung.interfaces.IFressbar;

public class Schwein extends Saeugetier{
	
	public void fressen() {
		System.out.println("Schwein frisst");
	}

	@Override
	public void sprich() {
		System.out.println("OOOOiiiiinnnnkkk");		
	}

	@Override
	public void fressen(IFressbar fressbares) {
		fressbares.wirdgefressen();
	}
	

	
}
