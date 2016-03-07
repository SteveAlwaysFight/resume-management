package com.baanyan.admin_resume.model;

import java.io.Serializable;
import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;
import com.baanyan.admin_resume.model.Keyword;

/**
 * Created by Bowen Yao on 3/4/2016
 */

@Entity
@Table(name="admin_resume_element")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Element extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5487748708678668157L;

	@ManyToMany	
	private Set<Keyword> keywords;
	
	public Set<Keyword> getKeywords() {
		return keywords;
	}


	public void setKeywords(Set<Keyword> keywords) {
		this.keywords = keywords;
	}
	
}
