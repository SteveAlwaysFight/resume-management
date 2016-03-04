package com.baanyan.user_resume.dao;
/**
 * Create by Bowen Yao at 3/1/2016
 */
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.baanyan.common.dao.HibernateBaseGenericDAOImpl;
import com.baanyan.user_resume.model.UserResume;

@Repository("userResumeDao")
public class UserResumeDaoImpl extends HibernateBaseGenericDAOImpl<UserResume, String> implements UserResumeDao {

	@Autowired
	public UserResumeDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(UserResume entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

	@Override
	public UserResume get(String id) {
		// TODO Auto-generated method stub
		return super.get(id);
	}

	@Override
	public UserResume load(String id) {
		// TODO Auto-generated method stub
		return super.load(id);
	}

	@Override
	public List<UserResume> loadAll() {
		// TODO Auto-generated method stub
		return super.loadAll();
	}

	@Override
	public void save(UserResume entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void saveOrUpdate(UserResume entity) {
		// TODO Auto-generated method stub
		super.saveOrUpdate(entity);
	}

	@Override
	public void update(UserResume entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public UserResume getbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getbyParam(param, value);
	}

	@Override
	public List<UserResume> getListbyParam(String param, Object value) {
		// TODO Auto-generated method stub
		return super.getListbyParam(param, value);
	}

	@Override
	public List<UserResume> getListbyField(String[] fields) {
		// TODO Auto-generated method stub
		return super.getListbyField(fields);
	}

	@Override
	public List<UserResume> getListbyParams(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyParams(map);
	}

	@Override
	public List<UserResume> getListbyFieldAndParams(String[] fields, Map<String, Object> map) {
		// TODO Auto-generated method stub
		return super.getListbyFieldAndParams(fields, map);
	}	

}
