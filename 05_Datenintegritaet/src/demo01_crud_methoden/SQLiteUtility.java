package demo01_crud_methoden;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	
	public static void transctionWithoutRollback() {
		String sql = "UPDATE mitarbeiter SET vorname = ? WHERE id = ?";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, "Markus");
			stm.setInt(2, 1);
			int rowsAffected = stm.executeUpdate();
			System.out.println(rowsAffected + " rows affected");
			/*
			 * id 10 existiert nicht in der DB, also klappt das Aendern des Datensatzes nicht.
			 * Der Datensatz mit der id 1 wird geaendert, was nicht sein soll.
			 */
			stm.setString(1, "Vorname2");
			stm.setInt(2, 10);
			rowsAffected = stm.executeUpdate();
			System.out.println(rowsAffected + " rows affected");
			
			stm.setString(1, "Vorname2");
			stm.setInt(2, 2);
			rowsAffected = stm.executeUpdate();
			System.out.println(rowsAffected + " rows affected");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
