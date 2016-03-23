package com.baanyan.admin_resume.dto;

import java.util.HashSet;
import java.util.Set;

import com.baanyan.admin_resume.model.Keyword;

/**
 * @author Bowen 3/11/2016
 */

public class ResponsibilityRequest {
	
	private Set<Keyword> keywords = new HashSet<Keyword>();
	private String content;
	
	public Set<Keyword> getKeywords() {
		return keywords;
	}
	public void setKeywords(Set<Keyword> keywords) {
		this.keywords = keywords;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
