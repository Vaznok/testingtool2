package com.epam.rd.dto;

import com.epam.rd.json.JsonLocalDateDeserializer;
import com.epam.rd.json.JsonLocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class UserDto {

    private Long id;

    private String email;

    private String password;

    private Boolean enabled;

    private UserRoleDto userRole;

    private String firstName;

    private String lastName;

    @JsonDeserialize(using = JsonLocalDateDeserializer.class)
    @JsonSerialize(using = JsonLocalDateSerializer.class)
    private LocalDate birthday;

    private String city;

    private String gender;

    private String mobilePhone;
}
