package com.epam.rd.dto;

import com.epam.rd.data.access.domain.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructPermissionConverter {

    PermissionDto permissionToPermisionDto(Permission permission);

    Permission permissionDtoToPermission(PermissionDto permissionDto);
}
