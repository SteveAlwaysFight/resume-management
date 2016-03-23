package com.baanyan.admin_resume.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;

/**
 * Created by Bowen Yao 3/5/2016
 */

@Entity
@Table(name="admin_resume_category")
public class Category extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8178494702439240589L;
	private String categoryName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="category")
	private Set<Keyword> keywords;
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Set<Keyword> getKeywords() {
		return keywords;
	}
	public void setKeywords(Set<Keyword> keywords) {
		this.keywords = keywords;
	}
	@Override
	public int hashCode() {
		final int prime = 241;
		int result = 1;
		result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		System.out.println("Category Class Comparation: "+getClass().getName()+" "+obj.getClass().getName());
//		if (getClass() != obj.getClass())
//			return false;
//		防止出现比对实际对象与代理对象时候出现的差错
		Category other = (Category) obj;
		if (this.getCategoryName() == null) {
			if (other.getCategoryName() != null)
				return false;
		} else if (!this.getCategoryName().equals(other.getCategoryName()))
			return false;
		return true;
	}
	
}
