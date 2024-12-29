package com.todo.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Driver {

	
	private static Connection con;

	public static Connection connect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todo", "root", "javadeveloper");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
