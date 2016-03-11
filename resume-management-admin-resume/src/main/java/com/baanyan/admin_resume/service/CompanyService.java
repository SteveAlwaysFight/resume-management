package com.baanyan.admin_resume.service;

import java.util.List;

import com.baanyan.admin_resume.dto.CompanyRequest;
import com.baanyan.admin_resume.model.Company;
import com.baanyan.common.service.IBaseGenericService;

public interface CompanyService extends IBaseGenericService<Company, String> {

	Company createCompany(CompanyRequest request);
	
	void deleteCompany(String companyID);
	
	Company updateCompany(String companyID, CompanyRequest request);
	
	Company getCompanybyID(String companyID);
	
	List<Company> getAllCompanies();
	
}
