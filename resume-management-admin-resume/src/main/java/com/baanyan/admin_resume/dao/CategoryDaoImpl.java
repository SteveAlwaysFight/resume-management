package com.baanyan.admin_resume.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baanyan.admin_resume.model.Category;
import com.baanyan.common.dao.HibernateBaseGenericDAOImpl;

/**
 * Created by Bowen Yao 3/6/2016
 */

@Repository("categoryDao")
public class CategoryDaoImpl extends HibernateBaseGenericDAOImpl<Category, String> implements CategoryDao {

	@Autowired
	public CategoryDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(Category entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public Category get(String id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public Category load(String id) {
		// TODO Auto-generated method stub
		return super.load(id);
	}

	@Override
	public List<Category> loadAll() {
		// TODO Auto-generated method stub
		return super.loadAll();
	}

	@Override
	public void save(Category entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void saveOrUpdate(Category entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public void update(Category entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public Category getbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getbyParam(param, value);
	}

	@Override
	public List<Category> getListbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getListbyParam(param, value);
	}

	@Override
	public List<Category> getListbyField(String[] fields) {
		// TODO Auto-generated method stub
		return super.getListbyField(fields);
	}

	@Override
	public List<Category> getListbyParams(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyParams(map);
	}

	@Override
	public List<Category> getListbyFieldAndParams(String[] fields, Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyFieldAndParams(fields, map);
	}
	
	
	
}
