package com.baanyan.admin_resume.model;

import java.util.Date;
import java.util.List;

import com.baanyan.admin_resume.model.Company;
import com.baanyan.admin_resume.model.ProjectSummary;
import com.baanyan.admin_resume.model.Responsibility;

import java.util.HashMap;

/**
 * Create by Bowen Yao on 3/3/2016
 */

public class ProjectExperience extends Element {
	
	private Company company;
	private Date startDate;
	private Date endDate;
	private String RoleName;
	private ProjectSummary projectsummary;
	private List<Responsibility> Responsibilities;
	private HashMap<String, Integer> Enviornemnt;
	
	//keyword
	
	
}
