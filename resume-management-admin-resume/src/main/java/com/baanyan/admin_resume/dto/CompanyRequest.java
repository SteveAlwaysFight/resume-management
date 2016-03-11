package com.baanyan.admin_resume.dto;

import com.baanyan.admin_resume.model.Address;
/**
 * Created by Bowen Yao 3/9/2016
 */

public class CompanyRequest {
	
	private String companyName;
	private Address address;
	
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
