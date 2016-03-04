package com.baanyan.user_resume.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/** 
 * Created by Bowen Yao on 3/3/2016
 */
@Table(name="ProjectExperience")
@Entity
public class ProjectExperience implements Serializable{
	private int ProjectExperienceID;
	private String ProjectName;
	private String Company; 
	private String ProjectSummary;
	private List<Responsibility> responsibilityList = new ArrayList<>();
	private Date DateStarted;
	private Date DateEnded;
}
