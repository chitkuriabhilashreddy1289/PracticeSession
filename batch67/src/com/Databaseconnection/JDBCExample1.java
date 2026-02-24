package com.Databaseconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCExample1 {
	DatabaseCon db;
	Connection con = null;

	public void insert() {
		// Loading driver
		try {
			db = new DatabaseCon();
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("insert into student(sname,marks)values(?,?)");
			ps.setString(1, "abhi");
			ps.setInt(2, 91);
			int n = ps.executeUpdate();
			if (n > 0) {
				System.out.println(n + "  rows effected");
			} else {
				System.out.println("something went wrong");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void select() {
		try {
			db = new DatabaseCon();
			con = db.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("sno") +":" +rs.getString("sname")+":"  +rs.getInt("marks"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
