package com.epam.rd.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class UserRoleDto {

    private Long id;

    private String role;
}
