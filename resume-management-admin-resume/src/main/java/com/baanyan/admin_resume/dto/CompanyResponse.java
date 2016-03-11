package com.baanyan.admin_resume.dto;

import com.baanyan.admin_resume.model.Address;
import com.baanyan.admin_resume.model.Company;

/**
 * Created by Bowen Yao 3/9/2016
 */

public class CompanyResponse {

	private String companyID;
	private String companyName;
	private Address address;
	
	public CompanyResponse(Company company) {
		this.companyID = company.getId();
		this.companyName = company.getCompanyName();
		this.address = company.getAddress();
	}
	
	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
