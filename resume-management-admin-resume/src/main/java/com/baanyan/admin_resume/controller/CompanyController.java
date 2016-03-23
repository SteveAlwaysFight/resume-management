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
	
	/**
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/companies", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> createCompany(@RequestBody CompanyRequest request) {
		CompanyResponse companyResponse = companyService.createCompany(request);
		return new ResponseEntity<CompanyResponse>(companyResponse,HttpStatus.CREATED);
	}
	
	/**
	 * @param companyId
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/companies/{companyID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> getCompany(@PathVariable("companyID") String companyId) {
		CompanyResponse companyResponse = companyService.getCompanybyID(companyId);
		return new ResponseEntity<CompanyResponse>(companyResponse, HttpStatus.OK);
	}
	
	/**
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/companies", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CompanyResponse>> getAllCompanies() {
		return new ResponseEntity<List<CompanyResponse>>(companyService.getAllCompanies(), HttpStatus.OK);
	}
	
	/**
	 * @param companyId
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/companies/{companyID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> updateCompany(@PathVariable("companyID") String companyId, @RequestBody CompanyRequest request) {
		CompanyResponse companyResponse = companyService.updateCompany(companyId, request);
		return new ResponseEntity<CompanyResponse>(companyResponse, HttpStatus.CREATED);
	}
	
	/**
	 * @param companyId
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/companies/{companyID}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CompanyResponse> deleteCompany(@PathVariable("companyID") String companyId) {
		companyService.deleteCompany(companyId);
		return new ResponseEntity<CompanyResponse>(HttpStatus.NO_CONTENT);
	}
}
