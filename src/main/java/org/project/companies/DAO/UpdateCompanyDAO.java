package org.project.companies.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.project.companies.model.Company;
import org.project.companies.util.DBConnection;
/*
 * Title: JSP Servlet JDBC MySQL CRUD Example Tutorial | Java Guides
 * Author: Java Guides
 * Date: Jan 26, 2020
 * Code version: 1.0
 * Availablity: https://www.youtube.com/watch?v=RqiuxA_OFOk
 * 
 */

public class UpdateCompanyDAO {
	/*
	 * Queries below are used in each of the methods in this class Adding, Updating,
	 * deleting and retrieving company data from the hosted database Each of these
	 * methods are picked up by the ModifyCompanyList Servlet
	 * 
	 */
	private static final String INSERT_COMPANIES_SQL = "INSERT INTO heroku_298fc475a99a62d.company_details (companyName, address, postcode, sector, details) VALUES (?,?,?,?,?);";
	private static final String SELECT_COMPANY_BY_ID = "select companyId, companyName, address, postcode, sector, details from company_details where companyId =?";
	private static final String SELECT_ALL_COMPANIES = "select * from company_details";
	private static final String DELETE_COMPANY_SQL = "delete from company_details where companyId = ?;";
	private static final String UPDATE_COMPANY_SQL = "update company_details set companyName = ?, address = ?, postcode = ?, sector = ?, details = ? where companyId = ?;";

	public UpdateCompanyDAO() {
	}

	DBConnection newDBConnection = new DBConnection();

	// Inserting company information to the database
	public void insertCompany(Company company) throws SQLException {
		System.out.println(INSERT_COMPANIES_SQL);
		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_COMPANIES_SQL)) {
			preparedStatement.setString(1, company.getCompanyName());
			preparedStatement.setString(2, company.getAddress());
			preparedStatement.setString(3, company.getPostcode());
			preparedStatement.setString(4, company.getSector());
			preparedStatement.setString(5, company.getDetails());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// update exisiting company data to the database
	public boolean updateCompany(Company company) throws SQLException {
		boolean companyUpdated;
		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_COMPANY_SQL);) {
			System.out.println(preparedStatement);
			preparedStatement.setString(1, company.getCompanyName());
			preparedStatement.setString(2, company.getAddress());
			preparedStatement.setString(3, company.getPostcode());
			preparedStatement.setString(4, company.getSector());
			preparedStatement.setString(5, company.getDetails());
			preparedStatement.setInt(6, company.getCompanyId());
			companyUpdated = preparedStatement.executeUpdate() > 0;
		}
		return companyUpdated;
	}

	// Select company by id
	public Company selectCompany(int companyId) {
		Company company = null;
		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_COMPANY_BY_ID)) {
			preparedStatement.setInt(1, companyId);
			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String companyName = rs.getString("companyName");
				String address = rs.getString("address");
				String postcode = rs.getString("postcode");
				String sector = rs.getString("sector");
				String details = rs.getString("details");
				company = new Company(companyId, companyName, address, postcode, sector, details);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return company;
	}

	// Return all available companies
	public List<Company> selectAllCompanies() {
		List<Company> companies = new ArrayList<>();
		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COMPANIES)) {
			System.out.println(preparedStatement);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int companyId = rs.getInt("companyId");
				String companyName = rs.getString("companyName");
				String address = rs.getString("address");
				String postcode = rs.getString("postcode");
				String sector = rs.getString("sector");
				String details = rs.getString("details");
				companies.add(new Company(companyId, companyName, address, postcode, sector, details));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return companies;
	}

	// delete company by id
	public boolean deleteCompany(int companyId) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = newDBConnection.getConnection2();
				PreparedStatement statement = connection.prepareStatement(DELETE_COMPANY_SQL);) {
			statement.setInt(1, companyId);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
}
