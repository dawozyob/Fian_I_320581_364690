package demo02_sql_injection.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public DBConnection() {
		String url = "jdbc:sqlite:./DB/User.db";
		try {
			this.setCon(DriverManager.getConnection(url));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * bla'OR'a'='a
	 * als Passwort
	 */
	public void loginInSecure(String[] data) {
		System.out.println("--------------- Vorsicht vor SQL Injection!!!! ------------------");
		String name = data[0];
		String pass = data[1];
		
		String sql = "SELECT * FROM user WHERE name = '" + name + "'AND passwort='" + pass + "'";
		try {
			Statement stm = this.getCon().createStatement();
			ResultSet res = stm.executeQuery(sql);
			while(res.next()) {
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
			}
						
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}

	public void loginSecure(String[] userData) {
		System.out.println("--------------- Durch Prepared Statement vor SQL Injection geschuetzt ------------------");
		String sql = "SELECT * FROM user WHERE name = ? AND passwort = ?";
		try {
			PreparedStatement stm = this.getCon().prepareStatement(sql);
			stm.setString(1, userData[0]);
			stm.setString(2, userData[1]);
			ResultSet res = stm.executeQuery();
			while(res.next()) {
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
