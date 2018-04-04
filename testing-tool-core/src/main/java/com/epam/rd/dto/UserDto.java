package com.epam.rd.dto;

import com.epam.rd.json.JsonLocalDateDeserializer;
import com.epam.rd.json.JsonLocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class UserDto {

    private Long id;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Min(5)
    private String password;

    private Boolean enabled;

    @NotNull
    private UserRoleDto userRole;

    private String firstName;

    private String lastName;

    @JsonDeserialize(using = JsonLocalDateDeserializer.class)
    @JsonSerialize(using = JsonLocalDateSerializer.class)
    @Past
    private LocalDate birthday;

    private String city;

    private String gender;

    private String mobilePhone;
}
