package com.baanyan.admin_resume.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baanyan.admin_resume.model.Company;
import com.baanyan.common.dao.HibernateBaseGenericDAOImpl;

/**
 * Created by Bowen Yao 3/9/2016
 */

@Repository("companyDao")
public class CompanyDaoImpl extends HibernateBaseGenericDAOImpl<Company, String> implements CompanyDao{

	@Autowired
	public CompanyDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(Company entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public Company get(String id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public Company load(String id) {
		// TODO Auto-generated method stub
		return super.load(id);
	}

	@Override
	public List<Company> loadAll() {
		// TODO Auto-generated method stub
		return super.loadAll();
	}

	@Override
	public void save(Company entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void saveOrUpdate(Company entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public void update(Company entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public Company getbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getbyParam(param, value);
	}

	@Override
	public List<Company> getListbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getListbyParam(param, value);
	}

	@Override
	public List<Company> getListbyField(String[] fields) {
		// TODO Auto-generated method stub
		return super.getListbyField(fields);
	}

	@Override
	public List<Company> getListbyParams(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyParams(map);
	}

	@Override
	public List<Company> getListbyFieldAndParams(String[] fields, Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyFieldAndParams(fields, map);
	}
	
	
	
}
