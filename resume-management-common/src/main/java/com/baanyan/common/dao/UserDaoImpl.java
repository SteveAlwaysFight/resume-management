package com.baanyan.common.dao;

import com.baanyan.common.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by steve on 3/1/16.
 */
@Repository("userDao")
public class UserDaoImpl extends HibernateBaseGenericDAOImpl<User,String > implements UserDao {
    /**
     * 构造方法，根据实例类自动获取实体类类型
     *
     * @param sessionFactory
     */
    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public void delete(User entity) {
        super.delete(entity);
    }

    @Override
    public User get(String id) {
        return super.get(id);
    }

    @Override
    public User load(String id) {
        return super.load(id);
    }

    @Override
    public List<User> loadAll() {
        return super.loadAll();
    }

    @Override
    public void save(User entity) {
        super.save(entity);
    }

    @Override
    public void saveOrUpdate(User entity) {
        super.saveOrUpdate(entity);
    }

    @Override
    public void update(User entity) {
        super.update(entity);
    }

    @Override
    public User getbyParam(String param, Object value) {
        return super.getbyParam(param, value);
    }

    @Override
    public List<User> getListbyParam(String param, Object value) {
        return super.getListbyParam(param, value);
    }

    @Override
    public List<User> getListbyField(String[] fields) {
        return super.getListbyField(fields);
    }

    @Override
    public List<User> getListbyParams(Map<String, Object> map) {
        return super.getListbyParams(map);
    }

    @Override
    public List<User> getListbyFieldAndParams(String[] fields, Map<String, Object> map) {
        return super.getListbyFieldAndParams(fields, map);
    }
}
