package com.baanyan.admin_resume.service;

import java.util.List;

import com.baanyan.admin_resume.dto.CompanyRequest;
import com.baanyan.admin_resume.dto.CompanyResponse;
import com.baanyan.admin_resume.model.Company;
import com.baanyan.common.service.IBaseGenericService;

public interface CompanyService extends IBaseGenericService<Company, String> {

	CompanyResponse createCompany(CompanyRequest request);
	
	void deleteCompany(String companyID);
	
	CompanyResponse updateCompany(String companyID, CompanyRequest request);
	
	CompanyResponse getCompanybyID(String companyID);
	
	List<CompanyResponse> getAllCompanies();
	
}
