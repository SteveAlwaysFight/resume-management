package com.baanyan.admin_resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;

/**
 * Created by Bowen Yao 3/4/2016
 */

@Entity
@Table(name="admin_resume_address")
public class Address extends BaseEntity {
	
	private String city;
	private String state;
	
	@Column
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
