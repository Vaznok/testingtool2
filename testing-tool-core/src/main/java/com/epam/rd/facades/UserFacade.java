package com.epam.rd.facades;

import com.epam.rd.dto.UserDto;

import java.util.List;

public interface UserFacade {

    List<UserDto> findAll();

    UserDto findUserByEmail(String email);
}
