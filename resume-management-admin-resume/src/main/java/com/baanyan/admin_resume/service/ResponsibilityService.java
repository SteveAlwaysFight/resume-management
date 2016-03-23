package com.baanyan.admin_resume.service;

import java.util.List;

import com.baanyan.admin_resume.dto.ResponsibilityRequest;
import com.baanyan.admin_resume.dto.ResponsibilityResponse;
import com.baanyan.admin_resume.model.Responsibility;
import com.baanyan.common.service.IBaseGenericService;

/**
 * @author Bowen 3/11/2016
 */

public interface ResponsibilityService extends IBaseGenericService<Responsibility, String> {
	
	ResponsibilityResponse createResponsibility(String categoryName, ResponsibilityRequest request);
	
	void deleteResponsibility(String responsibilityID);
	
	ResponsibilityResponse updateResponsibility(String categoryName, String responsibilityId, ResponsibilityRequest request);
	
	ResponsibilityResponse getResponsibilitybyID(String responsibilityID);
	
	List<ResponsibilityResponse> getAllResponsibilities();

}
