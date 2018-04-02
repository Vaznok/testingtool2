package com.epam.rd.services;

import com.epam.rd.data.access.domain.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findAll();

    Permission find(Long id);

    Permission add(Permission model);

    Permission update(Permission model);

    void delete(Long id);
}

