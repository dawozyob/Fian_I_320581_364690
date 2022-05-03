package demo01_gui.mvc.model;

public class Model {
	private int zahl;

	public int getZahl() {
		return zahl;
	}

	public void setZahl(int zahl) {
		this.zahl = zahl;
	}
	
	public Model() {
		this.setZahl(0);
	}
	
	public int countUp() {
		this.setZahl(this.getZahl() + 1);
		return this.getZahl();
	}
	public int countDown() {
		this.setZahl(this.getZahl() - 1);
		return this.getZahl();
	}
}
