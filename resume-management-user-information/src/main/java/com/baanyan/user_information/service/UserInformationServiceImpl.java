package com.baanyan.user_information.service;

import com.baanyan.common.dao.UserDao;
import com.baanyan.common.model.User;
import com.baanyan.user_information.dao.UserInformationDao;
import com.baanyan.user_information.dto.CreateUserInformationRequest;
import com.baanyan.user_information.model.UserInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by steve on 3/1/16.
 */
@Service
@Transactional
public class UserInformationServiceImpl extends com.baanyan.common.service.BaseGenericServiceImpl<UserInformation,String> implements UserInformationService {

    @Autowired
    UserInformationDao userInformationDao;
    @Autowired
    UserDao userDao;

    public UserInformation createUserInformation(String user_id,CreateUserInformationRequest request) {
        UserInformation userInformation = new UserInformation();
        userInformation.setFirstName(request.getFirstName());
        userInformation.setLastName(request.getLastName());
        User user = userDao.get(user_id);
        userInformation.setUser(user);
        userInformationDao.save(userInformation);
        return userInformation;
    }

    @Override
    public void delete(UserInformation entity) {
        userInformationDao.delete(entity);
    }

    @Override
    public UserInformation get(String id) {
        return userInformationDao.get(id);
    }

    @Override
    public UserInformation load(String id) {
        return userInformationDao.load(id);
    }

    @Override
    public List<UserInformation> loadAll() {
        return userInformationDao.loadAll();
    }

    @Override
    public void save(UserInformation entity) {
        userInformationDao.save(entity);
    }

    @Override
    public void saveOrUpdate(UserInformation entity) {
        userInformationDao.saveOrUpdate(entity);
    }

    @Override
    public void update(UserInformation entity) {
        userInformationDao.update(entity);
    }
}
