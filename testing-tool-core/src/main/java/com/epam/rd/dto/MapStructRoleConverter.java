package com.epam.rd.dto;

import com.epam.rd.data.access.domain.Role;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructRoleConverter {

    UserRoleDto userRoleToUserRoleDto(Role userRole);

    Role userRoleDtoToUserRole(UserRoleDto userRoleDto);
}
