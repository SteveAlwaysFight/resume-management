package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Bowen Yao 3/8/2016 
 */

@Entity
@Table(name="admin_resume_skill")
public class Skill extends Keyword implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7001881404077677034L;
	
}
