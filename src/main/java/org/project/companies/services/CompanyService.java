package org.project.companies.services;

import java.util.List;

import org.project.companies.DAO.CompanyDAO;
import org.project.companies.model.Company;

/*
 * Class is used to to communicate with the company resource class
 * Methods in this class call the DAO methods which interact with the database
 * Providing a bridge between the resource class and the database
 */

public class CompanyService {

	CompanyDAO DAO = new CompanyDAO();

	public List<Company> getCompany() {
		List<Company> list = DAO.getCompany();
		return list;
	}

	public void addCompany(Company company) {
		DAO.addCompany(company);

	}

	public void updateCompany(Company updatedCompany) {
		DAO.updateCompany(updatedCompany);

	}

	public void deleteCompany(int companyId) {
		DAO.deleteCompany(companyId);

	}

}
