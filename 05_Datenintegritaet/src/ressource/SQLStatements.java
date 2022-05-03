package ressource;

public class SQLStatements {
	public static final String createDB = "CREATE TABLE personen (\r\n"
			+ "	  id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\r\n"
			+ "	  vorname VARCHAR(45),\r\n"
			+ "	  nachname VARCHAR(45),\r\n"
			+ "	  geburtsjahr INT,\r\n"
			+ "	  CONSTRAINT pk_id PRIMARY KEY (id) )"; 
}
