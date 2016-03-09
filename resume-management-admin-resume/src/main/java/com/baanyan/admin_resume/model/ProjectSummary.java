package com.baanyan.admin_resume.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;

/**
 * Create by Bowen Yao 3/4/2016
 */

@Entity
@Table(name="admin_resume_projectsummary")
public class ProjectSummary extends BaseEntity {
	
	private String projectName;
	
	@Column
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	
}
