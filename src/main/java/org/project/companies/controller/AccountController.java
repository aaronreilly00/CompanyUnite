package org.project.companies.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AccountController {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String fullName = firstName + lastName;
		System.out.println("My name is "+fullName);
		*/
		
		String username = "root";
		String password = "Celeron123!";
		String jdbcURL = "jdbc:mysql://localhost:3306/";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter writer = resp.getWriter();
			writer.println("Connecting to database"+jdbcURL);
			
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			writer.println("Connection successful");
			connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("fname");
		String lastName = req.getParameter("lname");
		String fullName = firstName + lastName;
		System.out.println("My name is "+fullName);
	}
}
