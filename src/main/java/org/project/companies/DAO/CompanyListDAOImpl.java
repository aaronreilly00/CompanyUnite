package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.project.companies.model.AccountDetails;
import org.project.companies.model.Company;
import org.project.companies.util.DBConnection;

public class CompanyListDAOImpl implements CompanyListDAO {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	@Override
	public List<Company> get() {
		//Create reference variables
				List<Company> list = null;
				Company companyDetails = null;
				
				try {
					list = new ArrayList<Company>();
					
					//Create a sql query
					String sql = "SELECT * FROM companies";
					
					//Get the database connection
					connection = DBConnection.openConnection();
					
					//Create a statement
					statement = connection.createStatement();
					
					//Execute the sql query
					resultSet = statement.executeQuery(sql);
					
					//Process the resultSet
					while(resultSet.next()) {
						companyDetails = new Company();
						companyDetails.setCompanyId(resultSet.getInt("companyId"));
						companyDetails.setCompanyName(resultSet.getString("companyName"));
						companyDetails.setCompanyAddress(resultSet.getString("companyAddress"));
						companyDetails.setCompanyPostcode(resultSet.getString("companyPostcode"));
						//Add company details to list
						list.add(companyDetails);
					}

					
				}catch(Exception e) {
					e.printStackTrace();
				}
				//return the list
				return list;
			}

}
