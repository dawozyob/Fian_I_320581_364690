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
			 * id 10 existiert nicht in der DB, also klappt das Aendern des Datensatzes
			 * nicht. Der Datensatz mit der id 1 wird geaendert, was nicht sein soll.
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

	/*
	 * A transaction has four main attributes, which are known as ACID.
	 * 
	 * The letter A stands for atomicity. It means that each transaction must be all
	 * or nothing. If any operation in the transaction fails, the database state
	 * remains unchanged.
	 * 
	 * The letter C stands for consistency. It makes sure that any transaction will
	 * bring the data in the database from one valid state to another.
	 * 
	 * The letter I stands for isolation. This is for concurrency control. It
	 * ensures that the all concurrent execution of transactions produce the same
	 * result as if they were executed sequentially.
	 * 
	 * The letter D stands for durability. It means when the transaction is
	 * committed, it will remain intact regardless of any errors such as power loss.
	 * 
	 * You use transactions when the set of database operations you are making needs
	 * to be atomic.
	 * 
	 * That is - they all need to succeed or fail. Nothing in between.
	 */
	public static void transactionWithRollback() {
		try {
			con.setAutoCommit(false);

			String sql = "UPDATE mitarbeiter SET vorname = ? WHERE id = ?";

			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, "Max");
			stm.setInt(2, 1);
			int rowsAffected = stm.executeUpdate();
			System.out.println(rowsAffected + " rows affected");

			if (rowsAffected < 1) {
				con.rollback();
				return;
			}

			stm.setString(1, "Vorname2");
			stm.setInt(2, 10);
			rowsAffected = stm.executeUpdate();
			System.out.println(rowsAffected + " rows affected");

			/*
			 * Undoes all changes made in the current transaction and releases any database
			 * locks currently held by this Connection object. This method should be used
			 * only when auto-commit mode has been disabled.
			 */
			if (rowsAffected < 1) {
				con.rollback();
				return;
			}

			stm.setString(1, "Christa 2");
			stm.setInt(2, 2);
			rowsAffected = stm.executeUpdate();
			System.out.println(rowsAffected + " rows affected");

			if (rowsAffected < 1) {
				con.rollback();
				return;
			}
			/*
			 * Makes all changes made since the previous commit/rollback permanent and
			 * releases any database locks currently held by this Connection object.This
			 * method should be used only when auto-commit mode has been disabled.
			 */		
			con.commit();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

}
