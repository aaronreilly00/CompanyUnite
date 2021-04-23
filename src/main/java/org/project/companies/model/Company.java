package org.project.companies.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="company_details")
@Table(name="company_details")
public class Company {
	@Id
	@Column(name="companyId")
	int companyId;
	String companyName;
	String address;
	String postcode;
	String sector;
	String details;
	
	public Company() {
		
	}

	public Company(int companyId, String companyName, String address, String postcode, String sector, String details) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.address = address;
		this.postcode = postcode;
		this.sector = sector;
		this.details = details;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", address=" + address + ", postcode=" + postcode
				+ ", sector=" + sector + ", details=" + details + "]";
	}
	
	
}
