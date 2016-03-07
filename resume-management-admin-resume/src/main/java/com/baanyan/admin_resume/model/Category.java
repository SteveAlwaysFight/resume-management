package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Column;
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
	private String CategoryName;

	public String getTypeName() {
		return CategoryName;
	}

	public void setTypeName(String typeName) {
		CategoryName = typeName;
	}
	
}
