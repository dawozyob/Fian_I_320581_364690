package demo03_dependency_injection.persistenz;

import demo03_dependency_injection.data.Kunde;

public class Model {
	private IPersistenz pers;

	public IPersistenz getPers() {
		return pers;
	}

	public void setPers(IPersistenz pers) {
		this.pers = pers;
	}
	
	/*
	 * Die Abhaengigkeit zu der Persistenzklasse
	 * kann von aussen mitgegeben, also injiziert werden
	 * -> Dependency Injection
	 */
	public Model(IPersistenz pers) {
		this.setPers(pers);
	}
	
	public void speichereKunde(Kunde k) {
		this.getPers().saveCustomer(k);
	}
	
	public Kunde ladeKunde(int id) {
		return this.getPers().loadCustomer(id);
	}
	
	public void aktualisiereKunde(Kunde k) {
		this.getPers().updateCustomer(k);
	}
	
	public void loescheKunde(int id) {
		this.getPers().deleteCustomer(id);
	}
}
