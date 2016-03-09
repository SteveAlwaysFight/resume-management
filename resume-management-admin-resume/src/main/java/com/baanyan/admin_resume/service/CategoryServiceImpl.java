package com.baanyan.admin_resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baanyan.admin_resume.dao.CategoryDao;
import com.baanyan.admin_resume.dto.CategoryRequest;
import com.baanyan.admin_resume.model.Category;
import com.baanyan.common.service.BaseGenericServiceImpl;

/**
 * Created by Bowen Yao 3/7/2016
 */

@Service
@Transactional
public class CategoryServiceImpl extends BaseGenericServiceImpl<Category, String> implements CategoryService {
	
	@Autowired
	public CategoryDao categoryDao;

	public Category createCategory(CategoryRequest request) {
		Category category = new Category();
		category.setCategoryName(request.getCategoryName());
		categoryDao.save(category);
		return category;
	}
	
	public void deleteCategory(String CategoryID) {
		Category category = new Category();
		category = categoryDao.get(CategoryID);
		categoryDao.delete(category);
	}

	public Category updateCategory(String CategoryID, CategoryRequest request) {
		// TODO Auto-generated method stub
		Category category = categoryDao.get(CategoryID);
		category.setCategoryName(request.getCategoryName());
		categoryDao.update(category);
		return category;
	}

	public Category getCategorybyID(String CategoryID) {
		// TODO Auto-generated method stub
		Category category = new Category();
		category = categoryDao.get(CategoryID);
		return category;
	}

}
