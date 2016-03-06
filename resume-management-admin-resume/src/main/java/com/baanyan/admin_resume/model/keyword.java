package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;
import com.baanyan.admin_resume.model.Category;

/**
 * Created by Bowen Yao 3/5/2016
 */

@Entity
@Table(name="admin_resume_keyword")
public class keyword extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4181328155358306905L;
	private Category Category;

	@Column
	@ManyToOne
	public Category getCategory() {
		return Category;
	}

	public void setCategory(Category category) {
		this.Category = category;
	}
	
}
