package com.baanyan.admin_resume.model;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.baanyan.common.model.BaseEntity;
import com.baanyan.admin_resume.model.keyword;

/**
 * Created by Bowen Yao on 3/4/2016
 */

@Entity
@Table(name="admin_resume_element")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Element extends BaseEntity {
	
	private Set<keyword> keywords;
	
	@ManyToMany(mappedBy = "Element")	
	public Set<keyword> getKeywords() {
		return keywords;
	}


	public void setKeywords(Set<keyword> keywords) {
		this.keywords = keywords;
	}
	
}
