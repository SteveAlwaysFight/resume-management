package com.baanyan.admin_resume.model;

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

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public int hashCode() {
		final int prime = 601;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Address other = (Address) obj;
		if (this.getCity() == null) {
			if (other.getCity() != null)
				return false;
		} else if (!this.getCity().equals(other.getCity()))
			return false;
		if (this.getState() == null) {
			if (other.getState() != null)
				return false;
		} else if (!this.getState().equals(other.getState()))
			return false;
		return true;
	}
	
	
	
}
