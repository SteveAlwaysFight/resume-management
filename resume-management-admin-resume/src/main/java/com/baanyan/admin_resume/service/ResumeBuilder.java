package com.baanyan.admin_resume.service;




public abstract class ResumeBuilder {
	
	public abstract void buildPersonalSummary();
	
	public abstract void buildProjectExperience();
	
	public void buildResume() {
		buildPersonalSummary();
		buildProjectExperience();
	}
	
}
