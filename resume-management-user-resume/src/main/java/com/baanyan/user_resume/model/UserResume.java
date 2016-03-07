package com.baanyan.user_resume.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.baanyan.admin_resume.model.ProjectExperience;
import com.baanyan.common.model.BaseEntity;
import com.baanyan.common.model.User;


/**
 * Create by Bowen Yao at 3/1/2016
 */

public class UserResume extends BaseEntity {
	private User user;
	private ProjectExperience project_experience;
	
}
