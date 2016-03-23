package com.baanyan.admin_resume.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Type;

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

	@ManyToMany(fetch = FetchType.LAZY)
	@Cascade(value={CascadeType.SAVE_UPDATE})
	private Set<Keyword> keywords = new HashSet<Keyword>();
	
	@Type(type="text")
	private String content;
	
	public Set<Keyword> getKeywords() {
		return keywords;
	}
	
	public void setKeywords(Set<Keyword> keywords) {
		this.keywords = keywords;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void addKeyword(Keyword newKeyword) {
		keywords.add(newKeyword);
	}
	
}
