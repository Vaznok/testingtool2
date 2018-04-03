package com.epam.rd.dto;

import java.util.Set;

public class PermissionDto {

    private Integer id;

    private String permission;

    private Set<UserRoleDto> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Set<UserRoleDto> getRoles() {
        return roles;
    }

    public void setRoles(Set<UserRoleDto> roles) {
        this.roles = roles;
    }
}
