package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.project.companies.model.AccountDetails;
import org.project.companies.util.DBConnection;

public class TestCompaniesDAOImpl implements TestCompaniesDAO {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	@Override
	public List<AccountDetails> get() {

		//Create reference variables
		List<AccountDetails> list = null;
		AccountDetails accountDetails = null;
		
		try {
			list = new ArrayList<AccountDetails>();
			
			//Create a sql query
			String sql = "SELECT * FROM account_details";
			
			//Get the database connection
			connection = DBConnection.openConnection();
			
			//Create a statement
			statement = connection.createStatement();
			
			//Execute the sql query
			resultSet = statement.executeQuery(sql);
			
			//Process the resultSet
			while(resultSet.next()) {
				accountDetails = new AccountDetails();
				accountDetails.setId(resultSet.getInt("id"));
				accountDetails.setFirstName(resultSet.getString("first_name"));
				accountDetails.setLastName(resultSet.getString("last_name"));
				accountDetails.setUsername(resultSet.getString("username"));
				accountDetails.setPassword(resultSet.getString("password"));
				accountDetails.setAddress(resultSet.getString("address"));
				accountDetails.setContact(resultSet.getString("contact"));
				//Add account details to list
				list.add(accountDetails);
			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		//return the list
		return list;
	}

}
