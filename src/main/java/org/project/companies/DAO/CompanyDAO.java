package org.project.companies.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.project.companies.model.Company;

public class CompanyDAO {
	/*
	 * Hibernate used for creating a session getting current transaction then
	 * commiting those transactions
	 * 
	 * This DAO class supports the API aspect of the project
	 */

	// Connecting to the database
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Company.class)
			.buildSessionFactory();

	// API list all companies
	public List<Company> getCompany() {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Company> list = session.createQuery("from company_details").getResultList();
		return list;
	}

	// Add company through API
	public void addCompany(Company company) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(company);
		session.getTransaction().commit();

	}

	// Update existing company through API
	public void updateCompany(Company updatedCompany) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		int id = updatedCompany.getCompanyId();
		Company company = session.get(Company.class, id);
		// company = updatedCompany;
		company.setCompanyName(updatedCompany.getCompanyName());
		company.setAddress(updatedCompany.getAddress());
		company.setPostcode(updatedCompany.getPostcode());
		company.setSector(updatedCompany.getSector());
		company.setDetails(updatedCompany.getDetails());
		session.getTransaction().commit();
	}

	// Deleting a company through the API by identifying the Id
	public void deleteCompany(int companyId) {
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Company company = session.get(Company.class, companyId);
		session.delete(company);
		session.getTransaction().commit();

	}

}
