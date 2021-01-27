package com.akash;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBOperations {
	ConnectionClass db = new ConnectionClass();
	Statement st;
	PreparedStatement ps;

	public void insertEmp(int id, String name,int salary) {

		try {
			ps = db.getPreparedStatement("insert into employee values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, salary);
			ps.execute();

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void deleteEmp(int id) {

		try {
			ps = db.getPreparedStatement("delete from employee where id=?");
			ps.setInt(1, id);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmp(int id, String name) {

		try {
			ps = db.getPreparedStatement("update employee set name=? where id=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List displayEmp() {
		List l=new ArrayList();
		st = db.getStatement();

		try {
			ResultSet rs = st.executeQuery("select * from employee");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
				l.add(rs.getInt(1) + " " + rs.getString(2));
			}

			db.closeConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;

	}

}
