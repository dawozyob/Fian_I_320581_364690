package pak02_bauernhofVererbung.fauna;

import pak02_bauernhofVererbung.flora.Gemuese;
import pak02_bauernhofVererbung.interfaces.IFressbar;

public class Bauer extends Saeugetier {

	public void bewegen() {
		System.out.println("Bauer laeuft ");
	}

//	public void fuettern(Schwein s) {
//		s.fressen();
//	}
//	public void fuettern(Kuh k) {
//		k.fressen();
//	}

//	public void fuettern(Saeugetier s) {
//		if(s instanceof Kuh) {
//			((Kuh)s).fressen();			
//		}else if(s instanceof Schwein) {
//			((Schwein)s).fressen();
//		}
//	}

	public void fuettern(Saeugetier s, Gemuese g) {
		s.fressen(g);
	}

	@Override
	public void sprich() {
		System.out.println("Hallo Welt");
	}

	@Override
	public void fressen() {

	}

	@Override
	public void fressen(IFressbar g) {
		// TODO Auto-generated method stub
		
	}

}
