package demo01_crud_methoden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 * Absoluter Pfad
 * c:/MeinVerzeichnis
 * 
 * Relativer Pfad:
 * Ausgehend vom Ordner, in dem die Datei liegt.
 * 
 */
public class SQLiteUtility {
	private static Connection con = connect();
	
	private static Connection connect() {  
		String absolute = "C:\\Unterricht\\Workspaces_Unterricht\\FIAN_I_320581_364690\\Fian_I_320581_364690\\05_Datenintegritaet\\DB\\Mitarbeiter.db";
		String relativ = "./DB/Mitarbeiter.db";
		String url = "jdbc:sqlite:" + relativ;
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url);
			System.out.println("Verbindung erfolgreich");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		return con;
	}
}
