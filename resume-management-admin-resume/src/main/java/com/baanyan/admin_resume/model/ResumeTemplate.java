package com.baanyan.admin_resume.model;

import java.util.Set;

import com.baanyan.common.model.User;
import com.baanyan.admin_resume.model.PersonalSummary;
import com.baanyan.admin_resume.model.ProjectExperience;

/**
 * Created by Bowen Yao on 3/3/2016
 */

public class ResumeTemplate {
	
	private User user;
	private PersonalSummary summary;
	private Set<keyword> technical_skills;
	private ProjectExperience project_experience;
	
}
