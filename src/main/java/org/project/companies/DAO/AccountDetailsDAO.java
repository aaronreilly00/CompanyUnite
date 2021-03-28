package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.project.companies.model.AccountDetails;

public class AccountDetailsDAO {

	public int registerAccountDetails(AccountDetails accountDetails) throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO account_details" + 
				" (id, first_name, last_name, username, password, address, contact) VALUES " +
				" (?, ?, ?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/showroom1?useSSL=false", "root", "Celeron123!");
				
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, accountDetails.getFirstName());
			preparedStatement.setString(3, accountDetails.getLastName());
			preparedStatement.setString(4, accountDetails.getUsername());
			preparedStatement.setString(5, accountDetails.getPassword());
			preparedStatement.setString(6, accountDetails.getAddress());
			preparedStatement.setString(7, accountDetails.getContact());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
