package com.akash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	Connection conn;
	
	public DBConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public Connection getConnection() {

		try {
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
			System.out.println("Connection Created...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return this.conn;

	}

	public void closeConnection() {
		if (this.conn != null) {
			try {
				this.conn.close();
				System.out.println("Connection Closed...");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
