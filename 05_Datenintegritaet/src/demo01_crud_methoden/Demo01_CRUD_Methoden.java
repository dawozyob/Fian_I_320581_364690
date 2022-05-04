package demo01_crud_methoden;

import java.sql.Connection;
import java.sql.SQLException;

/*
 * C reate
 * R ead
 * U pdate
 * D elete
 * 
 * Der Begriff CRUD kommt aus der Informatik und steht f�r Create, Read, Update
 * und Delete. Dies sind die grundlegenden Aktionen, die in einer Datenbank
 * durchgef�hrt werden k�nnen. Alternativ werden f�r diese Operationen teilweise
 * auch die Akronyme RUDI oder CDUR verwendet.
 */

public class Demo01_CRUD_Methoden {
	public static void main(String[] args) {
		try {
			Connection c = DerbyUtilty.getConnectionInMemoryDatabase();
//			DerbyUtilty.createTestTable(c);
//			DerbyUtilty.fillTestTable(c);
//			DerbyUtilty.printTestTable(c);
			
			SQLiteUtility s = new SQLiteUtility();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
