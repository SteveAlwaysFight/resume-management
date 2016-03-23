package com.baanyan.admin_resume.dto;

import java.util.HashSet;
import java.util.Set;

import com.baanyan.admin_resume.model.Category;
import com.baanyan.admin_resume.model.Keyword;

/**
 * Created by Bowen Yao 3/7/2016
 */

public class CategoryResponse {
	
	private String categoryID;
	private String categoryName;
//	private Set<String> keywords_id;
	private Set<Keyword> keywords;
	
	public CategoryResponse(Category category) {
		this.categoryID = category.getId();
		this.categoryName = category.getCategoryName();
//		if(category.getKeywords()!=null) {
//			for( Keyword keyword : category.getKeywords() ) {
//				this.keywords_id.add(keyword.getId());
//			}
//		} else {
//			this.keywords_id = new HashSet<String>(0);
//		}
		this.keywords = category.getKeywords();
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

	public Set<Keyword> getKeywords() {
		return keywords;
	}

	public void setKeywords(Set<Keyword> keywords) {
		this.keywords = keywords;
	}

//	public Set<String> getKeywords_id() {
//		return keywords_id;
//	}
//
//	public void setKeywords_id(Set<String> keywords_id) {
//		this.keywords_id = keywords_id;
//	}
	
	
}
