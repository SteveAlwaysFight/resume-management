package com.baanyan.admin_resume.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baanyan.admin_resume.model.Responsibility;
import com.baanyan.common.dao.HibernateBaseGenericDAOImpl;

@Repository("responsibilityDao")
public class ResponsibilityDaoImpl extends HibernateBaseGenericDAOImpl<Responsibility, String>implements ResponsibilityDao {

	@Autowired
	public ResponsibilityDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(Responsibility entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public Responsibility get(String id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public Responsibility load(String id) {
		// TODO Auto-generated method stub
		return super.load(id);
	}

	@Override
	public List<Responsibility> loadAll() {
		// TODO Auto-generated method stub
		return super.loadAll();
	}

	@Override
	public void save(Responsibility entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void saveOrUpdate(Responsibility entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public void update(Responsibility entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public Responsibility getbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getbyParam(param, value);
	}

	@Override
	public List<Responsibility> getListbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getListbyParam(param, value);
	}

	@Override
	public List<Responsibility> getListbyField(String[] fields) {
		// TODO Auto-generated method stub
		return super.getListbyField(fields);
	}

	@Override
	public List<Responsibility> getListbyParams(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyParams(map);
	}

	@Override
	public List<Responsibility> getListbyFieldAndParams(String[] fields, Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyFieldAndParams(fields, map);
	}
	
	

}
