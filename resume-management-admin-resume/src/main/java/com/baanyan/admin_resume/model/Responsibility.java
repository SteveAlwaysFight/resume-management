package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.baanyan.admin_resume.model.Element;

/**
 * Created by Bowen Yao on 3/3/2016
 */

@Entity
@Table(name="admin_resume_responsibility")
public class Responsibility extends Element implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2224053594232339266L;	
	
}
