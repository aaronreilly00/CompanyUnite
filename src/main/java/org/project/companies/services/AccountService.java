package org.project.companies.services;

import java.util.List;

import org.project.companies.DAO.AccountDAO;
import org.project.companies.model.Account;

public class AccountService {

	AccountDAO dao = new AccountDAO();
	
	
	public List<Account> getAccountsByCompany(int companyId) {
		List<Account> accountList = dao.getAccountsByCompany(companyId);
		return accountList;
		
	}

}
