package com.baanyan.admin_resume.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.baanyan.common.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.baanyan.admin_resume.model.Category;

/**
 * Created by Bowen Yao 3/5/2016
 */

@Entity
@Table(name="admin_resume_keyword")
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","category"})
public class Keyword extends BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4181328155358306905L;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId_fk")
	private Category category;

	private String keywordName;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getKeywordName() {
		return keywordName;
	}

	public void setKeywordName(String keywordName) {
		this.keywordName = keywordName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((keywordName == null) ? 0 : keywordName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Keyword other = (Keyword) obj;
		if (this.getCategory() == null) {
			if (other.getCategory() != null)
				return false;
		} else if (!this.getCategory().equals(other.getCategory()))
			return false;
		if (this.getKeywordName() == null) {
			if (other.getKeywordName() != null)
				return false;
		} else if (!this.getKeywordName().equals(other.getKeywordName()))
			return false;
		return true;
	}

}










