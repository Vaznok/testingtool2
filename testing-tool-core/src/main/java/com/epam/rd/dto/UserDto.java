package com.epam.rd.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class UserDto {

    private Long id;

    private String email;

    private String password;

    private Boolean enabled;

    private String userRole;

    private String firstName;

    private String lastName;

    private Date birthday;

    private String city;

    private Boolean gender;

    private String mobilePhone;

}
