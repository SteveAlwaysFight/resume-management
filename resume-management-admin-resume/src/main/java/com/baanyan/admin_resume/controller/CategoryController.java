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
	
	@RequestMapping(value = "/admin_resume_categories",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> createCategory(@RequestBody CategoryRequest request) {
		Category category = categoryService.createCategory(request);
		return new ResponseEntity<CategoryResponse>(new CategoryResponse(category), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/admin_resume_categories/{categoryID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> getCategory(@PathVariable("categoryID") String categoryID) {
		Category category = categoryService.getCategorybyID(categoryID);
		return new ResponseEntity<CategoryResponse>(new CategoryResponse(category), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/admin_resume_categories", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CategoryResponse>> getAllCategories() {
		List<Category> allCategories = categoryService.getAllCategories();
		List<CategoryResponse> allCategoryResponses = new ArrayList<CategoryResponse>();
		for(Category category : allCategories) {
			allCategoryResponses.add(new CategoryResponse(category));
		}
		return new ResponseEntity<List<CategoryResponse>>(allCategoryResponses, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/admin_resume_categories/{categoryID}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> updateCategory(@PathVariable("categoryID") String categoryID, @RequestBody CategoryRequest request) {
		Category category = categoryService.updateCategory(categoryID, request);
		return new ResponseEntity<CategoryResponse>(new CategoryResponse(category), HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/admin_resume_categories/{categoryID}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryResponse> deleteCategory(@PathVariable("categoryID") String categoryID) {
		categoryService.deleteCategory(categoryID);
		return new ResponseEntity<CategoryResponse>(HttpStatus.NO_CONTENT);
	}
	
}
