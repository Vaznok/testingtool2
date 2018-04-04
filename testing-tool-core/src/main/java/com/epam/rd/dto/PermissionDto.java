package com.epam.rd.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PermissionDto {

    private Integer id;

    private String permission;
}
