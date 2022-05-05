package demo03_dependency_injection.persistenz;

import demo03_dependency_injection.data.Kunde;

public interface IPersistenz {
	void saveCustomer(Kunde k);
	Kunde loadCustomer(int kundenNummer);
	void updateCustomer(Kunde k);
	void deleteCustomer(int kundenNummer);
}
