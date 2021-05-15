package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.project.companies.model.Account;
import org.project.companies.util.DBConnection;

public class AccountDetailsDAO {

	// String constant containing an SQL query for inserting administrators details
	// once a connection is established
	public static final String INSERT_ACCOUNT_SQL = "INSERT INTO heroku_298fc475a99a62d.account_details "
			+ "(companyId, first_name, last_name, username, password, phone, email) VALUES (?, ?, ?, ?, ?, ?, ?);";

	// SQL query which will be used in the validate method
	public static final String SELECT_USERNAME_PASSWORD = "select * from account_details where username = ? and password = ? ";

	public AccountDetailsDAO() {

	}

	// Object used to connect to the hosted database
	DBConnection newDBConnection = new DBConnection();

	// Method for registering admin accounts first we need to establish a connection
	// by using a method availble by using newDBConnection object
	// we then assign our sql query to the precompiled object, allowing us to set
	// the values by using the get methods from Account class
	// then execute the update allowing us to write to the database
	public void registerAccountDetails(Account account) throws SQLException {
		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT_SQL)) {
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

	// Selecting all usernames and passwords, method will be used by a servlet to
	// validate login credentials are valid
	public boolean validate(Account account) throws ClassNotFoundException {
		boolean status = false;

		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERNAME_PASSWORD)) {
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
