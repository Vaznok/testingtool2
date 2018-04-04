package com.epam.rd.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class UserRoleDto {

    private String role;

    private Set<PermissionDto> permissions;
}
