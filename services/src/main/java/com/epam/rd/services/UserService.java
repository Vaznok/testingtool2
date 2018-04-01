package com.epam.rd.services;

import com.epam.rd.data.access.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User find(Long id);

    User add(User model);

    User update(User model);

    void delete(Long id);
}
