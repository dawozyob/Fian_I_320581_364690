package demo03_dependency_injection.persistenz;

import demo03_dependency_injection.data.Kunde;

public class DBPersistenz implements IPersistenz{

	@Override
	public void saveCustomer(Kunde k) {
		System.out.println("Kunde in Datenbank gespeichert");	
	}

	@Override
	public Kunde loadCustomer(int kundenNummer) {
		System.out.println("Kunde aus Datenbank geladen");
		return null;
	}

	@Override
	public void updateCustomer(Kunde k) {
		System.out.println("Kunde in Datenbank aktualisiert");	
	}

	@Override
	public void deleteCustomer(int kundenNummer) {
		System.out.println("Kunde in Datenbank geloescht");		
	}

}
