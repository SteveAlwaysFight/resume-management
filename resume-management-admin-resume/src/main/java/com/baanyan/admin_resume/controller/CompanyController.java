package com.baanyan.admin_resume.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baanyan.admin_resume.dto.CompanyRequest;
import com.baanyan.admin_resume.dto.CompanyResponse;
import com.baanyan.admin_resume.model.Company;
import com.baanyan.admin_resume.service.CompanyService;

/**
 * @author Bowen Yao 3/9/2016 
 */

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(value = "/admin_resume_companies", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> createCompany(@RequestBody CompanyRequest request) {
		Company company = companyService.createCompany(request);
		return new ResponseEntity<CompanyResponse>(new CompanyResponse(company),HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/admin_resume_companies/{companyID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> getCompany(@PathVariable("companyID") String companyId) {
		Company company = companyService.getCompanybyID(companyId);
		return new ResponseEntity<CompanyResponse>(new CompanyResponse(company), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/admin_resume_companies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CompanyResponse>> getAllCompanies() {
		List<Company> allCompanies = companyService.getAllCompanies();
		List<CompanyResponse> allCompanyResponses = new ArrayList<CompanyResponse>();
		for(Company company : allCompanies) {
			allCompanyResponses.add(new CompanyResponse(company));
		}
		return new ResponseEntity<List<CompanyResponse>>(allCompanyResponses, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/admin_resume_companies/{companyID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> updateCompany(@PathVariable("companyID") String companyId, @RequestBody CompanyRequest request) {
		Company company = companyService.updateCompany(companyId, request);
		return new ResponseEntity<CompanyResponse>(new CompanyResponse(company), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/admin_resume_companies/{companyID}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> deleteCompany(@PathVariable("companyID") String companyId) {
		companyService.deleteCompany(companyId);
		return new ResponseEntity<CompanyResponse>(HttpStatus.NO_CONTENT);
	}
}
