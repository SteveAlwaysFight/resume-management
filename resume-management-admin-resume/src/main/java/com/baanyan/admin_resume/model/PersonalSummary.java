package com.baanyan.admin_resume.model;

import javax.persistence.Column;

import com.baanyan.admin_resume.model.Element;

/**
 * Created by Bowen Yao on 3/4/2016
 */

public class PersonalSummary extends Element{

	public String getContent() {
		return content;
	}
	
	@Column
	public void setContent(String content) {
		this.content = content;
	}

	private String content;
	
}
