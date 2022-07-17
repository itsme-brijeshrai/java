package com.masai;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your employee Id -> ");
		int empId = sc.nextInt();
		sc.close();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Problem with loading the driver main class");
		}
		
		String cs = "jdbc:mysql://localhost:3306/db1";
		String username = "root";
		String password = "98Bliss@48";
		
		
		 try (Connection conn = DriverManager.getConnection(cs, username, password)){

			PreparedStatement ps = conn.prepareStatement("select salary from employee where eid = "+empId+" ");
			ResultSet res = ps.executeQuery();
			if(res.next()) {
				int salary = res.getInt("salary");
				System.out.print("empId : " + empId + "\n"+ "salary : " + salary);
			}
		} catch (SQLException e) {
			System.out.println("Check String_url | Username | Password");
		}
	
	}
	

}
