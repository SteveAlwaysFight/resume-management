package com.baanyan.admin_resume.model;

import javax.persistence.Column;

import com.baanyan.common.model.BaseEntity;

/**
 * Create by Bowen Yao 3/4/2016
 */

public class ProjectSummary extends BaseEntity {
	
	private String projectName;
	private String content;
	
	@Column
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Column
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
