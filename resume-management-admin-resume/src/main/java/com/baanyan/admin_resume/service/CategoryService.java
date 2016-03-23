package com.baanyan.admin_resume.service;

import java.util.List;

import com.baanyan.admin_resume.dto.CategoryRequest;
import com.baanyan.admin_resume.dto.CategoryResponse;
import com.baanyan.admin_resume.model.Category;
import com.baanyan.common.service.IBaseGenericService;

public interface CategoryService extends IBaseGenericService<Category, String> {
	
	CategoryResponse createCategory(CategoryRequest request);
	
	void deleteCategory(String categoryID);
	
	CategoryResponse updateCategory(String categoryID, CategoryRequest request);
	
	CategoryResponse getCategorybyID(String categoryID);
	
	List<CategoryResponse> getAllCategories();
	
}
