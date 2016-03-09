package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Entity;
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
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
}
