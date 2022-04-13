package pak02_bauernhofVererbung.items;

import pak02_bauernhofVererbung.interfaces.IFressbar;

public class Stein implements IFressbar{

	@Override
	public void wirdgefressen() {
		System.out.println("Stein wird gefressen");		
	}
	
}
