package com.epam.rd.services;

import com.epam.rd.data.access.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    User find(Long id);

    User getByEmail(String email);

    User add(User model);

    User update(User model);

    void delete(Long id);


}
