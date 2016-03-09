package com.baanyan.admin_resume.dto;

import com.baanyan.admin_resume.model.Category;

/**
 * Created by Bowen Yao 3/7/2016
 */

public class CategoryResponse {
	
	private String categoryID;
	private String categoryName;
	
	public CategoryResponse(Category category) {
		this.categoryID = category.getId();
		this.categoryName = category.getCategoryName();
	}	
	
	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
}
