package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.baanyan.common.model.BaseEntity;
import com.baanyan.admin_resume.model.Address;

/**
 * Create by Bowen Yao 3/4/2016
 */
@Entity
@Table(name="admin_resume_company")
public class Company extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9103797990532283926L;
	private String companyName;

	@OneToOne
	@Cascade(value= {CascadeType.SAVE_UPDATE, CascadeType.DELETE})
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
