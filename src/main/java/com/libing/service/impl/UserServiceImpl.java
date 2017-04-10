package com.libing.service.impl;

import com.libing.dao.UserDao;
import com.libing.entity.User;
import com.libing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by libing on 2017/4/8.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUserInfo() {
        return userDao.selectOneById(1l);
    }

}
