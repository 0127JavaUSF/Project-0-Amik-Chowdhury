package com.revature.project0.util;
// based on source code given to us through Github.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	public static Connection getConnected() {
		// Remember to store system variables. 
		String url = System.getenv("JDBC_URL");
		String user = System.getenv("JDBC_ROLE");
		String password = System.getenv("JDBC_PASSWORD");
		// jdbc:postgresql://host:port/database_name
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
