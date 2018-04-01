package com.epam.rd.services.impl;


import com.epam.rd.data.access.domain.User;
import com.epam.rd.data.access.repository.UserDao;
import com.epam.rd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User find(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public User add(User model) {
        return userDao.save(model);
    }

    @Override
    public User update(User model) {
        return userDao.save(model);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}
