package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Column;

import com.baanyan.admin_resume.model.Element;

/**
 * Created by Bowen Yao on 3/4/2016
 */

public class PersonalSummary extends Element implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8173421307362984455L;

	public String getContent() {
		return content;
	}
	
	@Column
	public void setContent(String content) {
		this.content = content;
	}

	private String content;
	
}
