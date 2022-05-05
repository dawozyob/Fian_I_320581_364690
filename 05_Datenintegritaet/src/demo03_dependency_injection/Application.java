package demo03_dependency_injection;

import demo03_dependency_injection.data.Kunde;
import demo03_dependency_injection.persistenz.DBPersistenz;
import demo03_dependency_injection.persistenz.DateiPersistenz;
import demo03_dependency_injection.persistenz.Model;
import demo03_dependency_injection.persistenz.OracleDBPersistenz;

public class Application {
	public static void main(String[] args) {
		Model dbModel = new Model(new DBPersistenz());
		Model dateiModel = new Model(new DateiPersistenz());
		Model oracleDBModel = new Model(new OracleDBPersistenz());
		
		dbModel.speichereKunde(new Kunde());
		dateiModel.speichereKunde(new Kunde());
		oracleDBModel.speichereKunde(new Kunde());
		
	}
}
