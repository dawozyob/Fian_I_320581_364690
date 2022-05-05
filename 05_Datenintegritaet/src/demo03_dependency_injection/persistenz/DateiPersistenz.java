package demo03_dependency_injection.persistenz;

import demo03_dependency_injection.data.Kunde;

public class DateiPersistenz implements IPersistenz{
	
	@Override
	public void saveCustomer(Kunde k) {
		System.out.println("Kunde in Datei gespeichert");	
	}

	@Override
	public Kunde loadCustomer(int kundenNummer) {
		System.out.println("Kunde aus Datei geladen");
		return null;
	}

	@Override
	public void updateCustomer(Kunde k) {
		System.out.println("Kunde in Datei aktualisiert");	
	}

	@Override
	public void deleteCustomer(int kundenNummer) {
		System.out.println("Kunde in Datei geloescht");		
	}
}
