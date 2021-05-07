package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.project.companies.model.Account;

public class AccountDetailsDAO {

	public int registerAccountDetails(Account account) throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO account_details" + 
				" (accountId, companyId, first_name, last_name, username, password, phone, email) VALUES " +
				" (?, ?, ?, ?, ?, ?, ?, ?);";
		
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/companyunite?useSSL=false", "root", "Celeron123!");
				
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1, 9);
			preparedStatement.setInt(2, 2);
			preparedStatement.setString(3, account.getFirstName());
			preparedStatement.setString(4, account.getLastName());
			preparedStatement.setString(5, account.getUsername());
			preparedStatement.setString(6, account.getPassword());
			preparedStatement.setString(7, account.getPhone());
			preparedStatement.setString(8, account.getEmail());
			
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean validate(Account account) throws ClassNotFoundException {
		boolean status = false;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/companyunite?useSSL=false", "root", "Celeron123!");
		
		PreparedStatement preparedStatement = connection.prepareStatement("select * from account_details where username = ? and password = ? ")){
			preparedStatement.setString(1, account.getUsername());
			preparedStatement.setString(2, account.getPassword());
			
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			printSQLException(e);
		}
		return status;
		
				
	}

	private void printSQLException(SQLException e) {
		// TODO Auto-generated method stub
		
	}
}
