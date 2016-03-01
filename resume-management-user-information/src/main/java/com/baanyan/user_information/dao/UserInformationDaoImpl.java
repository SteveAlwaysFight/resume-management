package com.baanyan.user_information.dao;

import com.baanyan.common.dao.HibernateBaseGenericDAOImpl;
import com.baanyan.user_information.model.UserInformation;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by steve on 3/1/16.
 */
@Repository("userInformationDao")
public class UserInformationDaoImpl extends HibernateBaseGenericDAOImpl<UserInformation,String> implements UserInformationDao{
    /**
     * 构造方法，根据实例类自动获取实体类类型
     *
     * @param sessionFactory
     */

    @Autowired
    public UserInformationDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public UserInformation getUserInformationByUserId(String user_id) {
       return  super.getbyParam("user_id",user_id);
    }


    @Override
    public void delete(UserInformation entity) {
        super.delete(entity);
    }

    @Override
    public UserInformation get(String id) {
        return super.get(id);
    }

    @Override
    public UserInformation load(String id) {
        return super.load(id);
    }

    @Override
    public List<UserInformation> loadAll() {
        return super.loadAll();
    }

    @Override
    public void save(UserInformation entity) {
        super.save(entity);
    }

    @Override
    public void saveOrUpdate(UserInformation entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void update(UserInformation entity) {
        super.update(entity);
    }

    @Override
    public UserInformation getbyParam(String param, Object value) {
        return super.getbyParam(param, value);
    }

    @Override
    public List<UserInformation> getListbyParam(String param, Object value) {
        return super.getListbyParam(param, value);
    }

    @Override
    public List<UserInformation> getListbyField(String[] fields) {
        return super.getListbyField(fields);
    }

    @Override
    public List<UserInformation> getListbyParams(Map<String, Object> map) {
        return super.getListbyParams(map);
    }

    @Override
    public List<UserInformation> getListbyFieldAndParams(String[] fields, Map<String, Object> map) {
        return super.getListbyFieldAndParams(fields, map);
    }
}
