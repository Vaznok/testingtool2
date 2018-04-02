package com.epam.rd.services.impl;

import com.epam.rd.data.access.domain.UserRole;
import com.epam.rd.data.access.repository.UserRoleRepository;
import com.epam.rd.services.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole find(Long id) {
        return userRoleRepository.findById(id).get();
    }

    @Override
    public UserRole add(UserRole model) {
        return userRoleRepository.save(model);
    }

    @Override
    public UserRole update(UserRole model) {
        return userRoleRepository.save(model);
    }

    @Override
    public void delete(Long id) {
        userRoleRepository.deleteById(id);
    }
}

