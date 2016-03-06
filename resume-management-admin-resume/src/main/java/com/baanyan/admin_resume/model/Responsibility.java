package com.baanyan.admin_resume.model;

import java.util.List;

import javax.persistence.Column;

import com.baanyan.admin_resume.model.Element;

/**
 * Created by Bowen Yao on 3/3/2016
 */

public class Responsibility extends Element {
	
	private String content;

	@Column
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
