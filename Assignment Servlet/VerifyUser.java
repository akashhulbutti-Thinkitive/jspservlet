package com.akash;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VerifyUser {
	
	private DBConnection dbCon;
	private Statement stmt;
	
	public VerifyUser() {
		this.dbCon=new DBConnection();
		stmt=null;
	}
	
	public boolean checkCredentials(String username,String password) {
		try {
			this.stmt=this.dbCon.getConnection().createStatement();
			ResultSet rs = this.stmt.executeQuery("select * from user where username='"+username+"' and password='"+password+"'");
			if(rs.next()) {
				System.out.println(" User is Present");
				return true;
			}
			System.out.println("User is Not present");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
