package com.baanyan.admin_resume.dto;

import java.util.Set;

import com.baanyan.admin_resume.model.Keyword;
import com.baanyan.admin_resume.model.Responsibility;

/**
 * @author Bowen 3/11/2016
 */

public class ResponsibilityResponse {
	
	private String responsibilityId;
	private Set<Keyword> keywords;
	private String content;

	public ResponsibilityResponse(Responsibility responsibility) {
		this.responsibilityId = responsibility.getId();
		this.keywords = responsibility.getKeywords();
		this.content = responsibility.getContent();
	}
	public String getResponsibilityId() {
		return responsibilityId;
	}
	public void setResponsibilityId(String responsibilityId) {
		this.responsibilityId = responsibilityId;
	}
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
