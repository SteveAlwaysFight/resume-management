package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Column;

import com.baanyan.common.model.BaseEntity;
import com.baanyan.admin_resume.model.Address;

/**
 * Create by Bowen Yao 3/4/2016
 */

public class Company extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9103797990532283926L;
	private String CompanyName;
	private Address address;
	
	@Column
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	
	@Column
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
