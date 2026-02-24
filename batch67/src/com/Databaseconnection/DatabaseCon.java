package com.Databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseCon {
	Connection con = null;

	public Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connection Establish

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/b667", "root", "root");
			// statement
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
