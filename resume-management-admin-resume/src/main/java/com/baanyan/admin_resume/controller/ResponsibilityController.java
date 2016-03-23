package com.baanyan.admin_resume.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.baanyan.admin_resume.dto.ResponsibilityRequest;
import com.baanyan.admin_resume.dto.ResponsibilityResponse;
import com.baanyan.admin_resume.service.ResponsibilityService;

/**
 * @author Bowen 3/11/2016
 */

@Controller
public class ResponsibilityController {

	@Autowired
	private ResponsibilityService responsibilityService;
	
	/**
	 * @param category
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "/admin-resume/responsibilities", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponsibilityResponse> createResponsibility(@RequestParam("category") String categoryName, @RequestBody ResponsibilityRequest request) {
		ResponsibilityResponse responsibilityResponse = responsibilityService.createResponsibility(categoryName, request);
		return new ResponseEntity<ResponsibilityResponse>(responsibilityResponse,HttpStatus.CREATED);
	}
	
	/**
	 * @param responsibilityId
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/responsibilities/{responsibilityID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponsibilityResponse> getResponsibility(@PathVariable("responsibilityID") String responsibilityId) {
		ResponsibilityResponse responsibilityResponse = responsibilityService.getResponsibilitybyID(responsibilityId);
		return new ResponseEntity<ResponsibilityResponse>(responsibilityResponse, HttpStatus.OK);
	}
	
	/**
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/responsibilities", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ResponsibilityResponse>> getAllCompanies() {
		return new ResponseEntity<List<ResponsibilityResponse>>(responsibilityService.getAllResponsibilities(), HttpStatus.OK);
	}
	
	/**
	 * @param categoryName
	 * @param responsibilityId
	 * @param request
	 * @return
	 */
	
	@RequestMapping(value = "/admin-resume/responsibilities/{responsibilityID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponsibilityResponse> updateResponsibility(@RequestParam("category") String categoryName, @PathVariable("responsibilityID") String responsibilityId, @RequestBody ResponsibilityRequest request) {
		ResponsibilityResponse responsibilityResponse = responsibilityService.updateResponsibility(categoryName, responsibilityId, request);
		return new ResponseEntity<ResponsibilityResponse>(responsibilityResponse, HttpStatus.CREATED);
	}
	
	/**
	 * @param responsibilityId
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/responsibilities/{responsibilityID}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponsibilityResponse> deleteResponsibility(@PathVariable("responsibilityID") String responsibilityId) {
		responsibilityService.deleteResponsibility(responsibilityId);;
		return new ResponseEntity<ResponsibilityResponse>(HttpStatus.NO_CONTENT);
	}
	
}
