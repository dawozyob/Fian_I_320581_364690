package pak02_bauernhofVererbung.flora;

public class Gemuese {
	private String sorte;

	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public Gemuese() {
		this("Standardgemuese");
	}

	public Gemuese(String sorte) {
		this.setSorte(sorte);
	}
	
	public void wirdgegessen() {
		System.out.println("Gemuese wird gegessen");
	}
}
