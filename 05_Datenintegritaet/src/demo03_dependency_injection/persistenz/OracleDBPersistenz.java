package demo03_dependency_injection.persistenz;

import demo03_dependency_injection.data.Kunde;

public class OracleDBPersistenz implements IPersistenz{
	@Override
	public void saveCustomer(Kunde k) {
		System.out.println("Kunde in Oracle Datenbank gespeichert");	
	}

	@Override
	public Kunde loadCustomer(int kundenNummer) {
		System.out.println("Kunde aus Oracle Datenbank geladen");
		return null;
	}

	@Override
	public void updateCustomer(Kunde k) {
		System.out.println("Kunde in Oracle Datenbank aktualisiert");	
	}

	@Override
	public void deleteCustomer(int kundenNummer) {
		System.out.println("Kunde in Oracle Datenbank geloescht");		
	}
}
