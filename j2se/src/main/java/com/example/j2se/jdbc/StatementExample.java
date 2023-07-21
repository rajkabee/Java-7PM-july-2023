package com.example.j2se.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExample {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/end_point_tech", "root", "root");
		String query = "insert into user(name, email) "
				+ "values('Sudhir Sharma', 'sudhir@gmail.com')";
		Statement stm = con.createStatement();
		int i = stm.executeUpdate(query);
		stm.close();
		con.close();
		if(i==1) {
			System.out.println("data saved to the database!");
		}
		else {
			System.out.println("Query failed!");
		}
		
		
	}
}
