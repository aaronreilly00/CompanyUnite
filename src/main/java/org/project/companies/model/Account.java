package org.project.companies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="accounts")
@Table(name="accounts")
public class Account {
	@Id
	int accountId;
	//hibernate feature 
	@ManyToOne(targetEntity=Company.class)
	@JoinColumn(name="companyId")
	Company company;
	
	String accountName;
	/*
	 * Add account details i.e 
	 * String firstName
	 * String lastName
	 * String email
	 * String password
	 * 
	 */
	String category;
	
	public Account() {
		
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	
	
	
}
