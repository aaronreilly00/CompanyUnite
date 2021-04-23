package org.project.companies.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

private static final String URL = "jdbc:mysql://localhost:3306/company";
	
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static final String USERNAME = "root";
	
	private static final String PASSWORD = "Celeron123!";
	
	private static Connection connection = null;
	
	public static Connection openConnection() {
		if (connection != null)
            return connection;
        else {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return connection;
        }
	}
}
