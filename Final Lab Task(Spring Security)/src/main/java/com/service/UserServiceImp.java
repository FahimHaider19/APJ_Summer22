package com.service;

import com.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        return userDao.authenticateUser(username, password);
    }
}
