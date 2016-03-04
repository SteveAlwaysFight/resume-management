package com.baanyan.user_resume.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;
import com.baanyan.common.model.User;
import com.baanyan.resume_template.model.ProjectExperience;


/**
 * Create by Bowen Yao at 3/1/2016
 */

@Entity
@Table(name = "user_resume")
public class UserResume extends BaseEntity {
	private User user;
	private ProjectExperience project_experience;
	
}
