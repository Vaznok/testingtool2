package com.epam.rd.dto;

import com.epam.rd.data.access.domain.UserRole;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructRoleConverter {

    UserRoleDto userRoleToUserRoleDto(UserRole userRole);

    UserRole userRoleDtoToUserRole(UserRoleDto userRoleDto);
}
