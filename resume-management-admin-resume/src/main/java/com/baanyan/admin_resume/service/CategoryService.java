package com.baanyan.admin_resume.service;

import java.util.List;

import com.baanyan.admin_resume.dto.CategoryRequest;
import com.baanyan.admin_resume.model.Category;
import com.baanyan.common.service.IBaseGenericService;

public interface CategoryService extends IBaseGenericService<Category, String> {
	
	Category createCategory(CategoryRequest request);
	
	void deleteCategory(String CategoryID);
	
	Category updateCategory(String CategoryID, CategoryRequest request);
	
	Category getCategorybyID(String CategoryID);
	
	List<Category> getAllCategory();
	
}
