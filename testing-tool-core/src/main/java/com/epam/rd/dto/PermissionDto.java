package com.epam.rd.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PermissionDto {

    private Integer id;

    @NotEmpty
    private String permission;
}
