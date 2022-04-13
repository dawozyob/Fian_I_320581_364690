package pak02_bauernhofVererbung.flora;

import pak02_bauernhofVererbung.interfaces.IFressbar;

public abstract class Gemuese implements IFressbar {
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

	

}
