package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.project.companies.model.Account;
import org.project.companies.util.DBConnection;

public class AccountDetailsDAO {
	
	public static final String INSERT_ACCOUNT_SQL = "INSERT INTO heroku_298fc475a99a62d.account_details "
			+ "(companyId, first_name, last_name, username, password, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?);";
	
	public AccountDetailsDAO() {
		
	}

	DBConnection newDBConnection = new DBConnection();
	
	public void registerAccountDetails(Account account) throws SQLException{
		System.out.println(INSERT_ACCOUNT_SQL);
		try(Connection connection = newDBConnection.getConnection2(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT_SQL)){
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, account.getFirstName());
			preparedStatement.setString(3, account.getLastName());
			preparedStatement.setString(4, account.getUsername());
			preparedStatement.setString(5, account.getPassword());
			preparedStatement.setString(6, account.getPhone());
			preparedStatement.setString(7, account.getEmail());
			System.out.println(preparedStatement);
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean validate(Account account) throws ClassNotFoundException {
		boolean status = false;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-01.cleardb.com/heroku_298fc475a99a62d", "b0a60f8774be0e", "13f98876");
		
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
