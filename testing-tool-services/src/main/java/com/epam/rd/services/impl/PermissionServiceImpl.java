package com.epam.rd.services.impl;

import com.epam.rd.data.access.domain.Permission;
import com.epam.rd.data.access.repository.PermissionRepository;
import com.epam.rd.services.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }

    @Override
    public Permission find(Long id) {
        return permissionRepository.findById(id).get();
    }

    @Override
    public Permission add(Permission model) {
        return permissionRepository.save(model);
    }

    @Override
    public Permission update(Permission model) {
        return permissionRepository.save(model);
    }

    @Override
    public void delete(Long id) {
        permissionRepository.deleteById(id);
    }
}

