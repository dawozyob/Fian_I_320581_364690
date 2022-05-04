package demo02_sql_injection.model;

public class Model {
	private DBConnection con;

	public DBConnection getCon() {
		return con;
	}

	public void setCon(DBConnection con) {
		this.con = con;
	}
	
	public Model() {
		this.setCon(new DBConnection());
	}
}
