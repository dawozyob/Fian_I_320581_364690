package demo01_crud_methoden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import ressource.ResourceLoader;

public class DerbyUtilty {
	/*
	 * A connection (session) with a specific database. SQL statements are executed
	 * and results are returned within the context of a connection.
	 * 
	 * Das Connection Objekt ist fuer die Verbindung zur Datenbank zustaendig
	 */
	public static Connection getConnectionInMemoryDatabase() throws SQLException {
		// Die Adresse der Datenbank
		String url = "jdbc:derby:memory:myDerby;create=true";
		
		/*
		 * DriverManager:
		 * The basic service for managing a set of JDBC drivers. 
		 * 
		 * DriverManager.getConnection(url):
		 * Attempts to establish a connection to the given database URL.The
		 * DriverManager attempts to select an appropriate driver from the set of
		 * registered JDBC drivers.
		 */
		return DriverManager.getConnection(url);
	}

	public static void createTestTable(Connection c) {
		try {
			/*
			 * c.createStatement():
			 * Creates a Statement object for sending SQL statements to
			 * the database. SQL statements without parameters are normally executed using
			 * Statement objects.
			 */
			Statement stm = c.createStatement();
			String sql = ResourceLoader.loadText("derby_create_table_personen.sql");
			stm.execute(sql);
			System.out.println("Tabelle erzeugt");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
