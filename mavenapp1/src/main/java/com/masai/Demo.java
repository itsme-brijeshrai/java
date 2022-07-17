package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String cs = "jdbc:mysql://localhost:3306/sb101db";
		try {
			Connection conn = DriverManager.getConnection(cs,"root","98Bliss@48");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
