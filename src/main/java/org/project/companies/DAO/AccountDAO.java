package org.project.companies.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.project.companies.model.Account;
import org.project.companies.model.Company;

public class AccountDAO {

	//Add DAO layer
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Account.class)
				.addAnnotatedClass(Company.class)
				.buildSessionFactory();

		public List<Account> getAccountsByCompany(int companyId) {
			Session session = factory.getCurrentSession();
			session.beginTransaction();
			List<Account> accountList;
			String sql = "from accounts where companyId = '"+companyId+"'";
			accountList = session.createQuery(sql).getResultList();
			return accountList;
		}
}
