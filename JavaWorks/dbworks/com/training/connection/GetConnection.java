package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	// connection related variables
	static Connection connection; 
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet rs, rs1, rs2; 
	
	public static Connection getMySqlConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/sdetdec",
							"root", "kanchan"); 
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
	public Connection getOracleConnection() {
		return null; 
	}
	
}
