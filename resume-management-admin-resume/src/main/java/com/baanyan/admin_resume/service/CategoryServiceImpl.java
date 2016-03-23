package com.baanyan.admin_resume.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baanyan.admin_resume.dao.CategoryDao;
import com.baanyan.admin_resume.dto.CategoryRequest;
import com.baanyan.admin_resume.dto.CategoryResponse;
import com.baanyan.admin_resume.model.Category;
import com.baanyan.admin_resume.model.Keyword;
import com.baanyan.common.service.BaseGenericServiceImpl;

/**
 * Created by Bowen Yao 3/7/2016
 */

@Service
@Transactional
public class CategoryServiceImpl extends BaseGenericServiceImpl<Category, String> implements CategoryService {
	
	@Autowired
	public CategoryDao categoryDao;

	public CategoryResponse createCategory(CategoryRequest request) {
		Category category = new Category();
		category.setCategoryName(request.getCategoryName());
		categoryDao.save(category);
		return new CategoryResponse(category);
	}
	
	public void deleteCategory(String categoryID) {
		categoryDao.delete(categoryDao.get(categoryID));
	}

	public CategoryResponse updateCategory(String categoryID, CategoryRequest request) {
		// TODO Auto-generated method stub
		Category category = categoryDao.get(categoryID);
		category.setCategoryName(request.getCategoryName());
		categoryDao.update(category);
		return new CategoryResponse(category);
	}

	public CategoryResponse getCategorybyID(String categoryID) {
		// TODO Auto-generated method stub
		Category category = categoryDao.get(categoryID);
		CategoryResponse categoryResponse = new CategoryResponse(category);
		Set<Keyword> keywords = category.getKeywords();
		for(Keyword keyword : keywords) {
			keyword.setId(keyword.getId());
		}
		categoryResponse.setKeywords(keywords);
		return categoryResponse;
	}

	public List<CategoryResponse> getAllCategories() {
		// TODO Auto-generated method stub
		List<Category> allCategories = categoryDao.loadAll();
		List<CategoryResponse> allCategoriesResponse = new ArrayList<CategoryResponse>();
		for(Category category : allCategories) {
			CategoryResponse categoryResponse = new CategoryResponse(category);
			Set<Keyword> keywords = category.getKeywords();
			for(Keyword keyword : keywords) {
				keyword.setId(keyword.getId());
			}
			categoryResponse.setKeywords(keywords);
			allCategoriesResponse.add(categoryResponse);
		}
		return allCategoriesResponse;
	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub
		categoryDao.delete(entity);
	}

	@Override
	public Category get(String id) {
		// TODO Auto-generated method stub
		return categoryDao.get(id);
	}

	@Override
	public Category load(String id) {
		// TODO Auto-generated method stub
		return categoryDao.load(id);
	}

	@Override
	public List<Category> loadAll() {
		// TODO Auto-generated method stub
		return categoryDao.loadAll();
	}

	@Override
	public void save(Category entity) {
		// TODO Auto-generated method stub
		categoryDao.save(entity);
	}

	@Override
	public void saveOrUpdate(Category entity) {
		// TODO Auto-generated method stub
		categoryDao.saveOrUpdate(entity);
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub
		categoryDao.update(entity);
	}
	
}
