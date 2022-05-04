package demo01_crud_methoden;

import java.sql.Connection;
import java.sql.SQLException;

/*
 * C reate
 * R ead
 * U pdate
 * D elete
 * 
 * Der Begriff CRUD kommt aus der Informatik und steht für Create, Read, Update
 * und Delete. Dies sind die grundlegenden Aktionen, die in einer Datenbank
 * durchgeführt werden können. Alternativ werden für diese Operationen teilweise
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
