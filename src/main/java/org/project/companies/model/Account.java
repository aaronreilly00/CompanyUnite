package org.project.companies.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name="accounts_details")
@Table(name="accounts_details")
public class Account {
	@Id
	int accountId;
	//hibernate feature 
	@ManyToOne(targetEntity=Company.class)
	@JoinColumn(name="companyId")
	Company company;
	
	String firstName;
	String lastName;
	String username;
	String password;
	String phone;
	String email;
	
	public Account() {
		
	}
	
	public Account(int accountId, Company company, String firstName, String lastName, String username, String password,
			String phone, String email) {
		
		this.accountId = accountId;
		this.company = company;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.email = email;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
