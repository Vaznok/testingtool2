package com.epam.rd.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class UserRoleDto {

    private Long id;

    @NotEmpty
    private String role;
}
