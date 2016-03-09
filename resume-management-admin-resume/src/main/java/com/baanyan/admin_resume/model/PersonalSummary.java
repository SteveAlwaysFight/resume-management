package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.baanyan.admin_resume.model.Element;

/**
 * Created by Bowen Yao on 3/4/2016
 */

@Entity
@Table(name="admin_resume_personalsummary")
public class PersonalSummary extends Element implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8173421307362984455L;

	
}
