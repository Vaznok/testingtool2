package com.epam.rd.services;

import com.epam.rd.data.access.domain.UserRole;

import java.util.List;

public interface UserRoleService {
    List<UserRole> findAll();

    UserRole find(Long id);

    UserRole add(UserRole model);

    UserRole update(UserRole model);

    void delete(Long id);
}

