package klassenDiagramm.pak01;

public class Kellner {
	public void servieren() {
		Gericht g = new Gericht();
		Gast gast = new Gast();
		gast.gerichtAnnehmen(g);
	}
}

class Gast{
	
	void gerichtAnnehmen(Gericht gericht) {
		
	}
}
