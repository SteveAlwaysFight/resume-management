package com.baanyan.common.dao;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.baanyan.common.model.User;
import com.baanyan.common.dao.*;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by steve on 3/1/16.
 */
@ContextConfiguration(locations = "classpath:spring-context-common.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoImplTest {
    @Autowired
    UserDao userDao;

    @Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @org.junit.Test
    @Rollback
    @Transactional
    public void testGet() throws Exception {
        User user = new User();
        userDao.save(user);
        User u = userDao.get(user.getId());
        assert(u.getCreateTime().equals(user.getCreateTime()));
    }

    @org.junit.Test
    public void testLoad() throws Exception {

    }

    @org.junit.Test
    public void testLoadAll() throws Exception {

    }

    @org.junit.Test
    public void testSave() throws Exception {

    }

    @org.junit.Test
    public void testSaveOrUpdate() throws Exception {

    }

    @org.junit.Test
    public void testUpdate() throws Exception {

    }

    @org.junit.Test
    public void testGetbyParam() throws Exception {

    }

    @org.junit.Test
    public void testGetListbyParam() throws Exception {

    }

    @org.junit.Test
    public void testGetListbyField() throws Exception {

    }

    @org.junit.Test
    public void testGetListbyParams() throws Exception {

    }

    @org.junit.Test
    public void testGetListbyFieldAndParams() throws Exception {

    }
}
