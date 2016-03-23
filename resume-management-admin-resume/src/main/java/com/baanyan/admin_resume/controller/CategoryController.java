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

import com.baanyan.admin_resume.dto.CategoryResponse;
import com.baanyan.admin_resume.dto.CategoryRequest;
import com.baanyan.admin_resume.model.Category;
import com.baanyan.admin_resume.service.CategoryService;

/**
 * Created by Bowen Yao 3/6/2016
 */

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	/**
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/categories",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> createCategory(@RequestBody CategoryRequest request) {
		CategoryResponse categoryResponse = categoryService.createCategory(request);
		return new ResponseEntity<CategoryResponse>(categoryResponse, HttpStatus.CREATED);
	}
	
	/**
	 * @param categoryID
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/categories/{categoryID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> getCategory(@PathVariable("categoryID") String categoryID) {
		CategoryResponse categoryResponse = categoryService.getCategorybyID(categoryID);
		return new ResponseEntity<CategoryResponse>(categoryResponse, HttpStatus.OK);
	}
	
	/**
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CategoryResponse>> getAllCategories() {
		return new ResponseEntity<List<CategoryResponse>>(categoryService.getAllCategories(), HttpStatus.OK);
	}
	
	/**
	 * @param categoryID
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/categories/{categoryID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> updateCategory(@PathVariable("categoryID") String categoryID, @RequestBody CategoryRequest request) {
		CategoryResponse categoryResponse = categoryService.updateCategory(categoryID, request);
		return new ResponseEntity<CategoryResponse>(categoryResponse, HttpStatus.CREATED);
	}
	
	/**
	 * @param categoryID
	 * @return
	 */
	@RequestMapping(value = "/admin-resume/categories/{categoryID}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> deleteCategory(@PathVariable("categoryID") String categoryID) {
		categoryService.deleteCategory(categoryID);
		return new ResponseEntity<CategoryResponse>(HttpStatus.NO_CONTENT);
	}
	
}
