package com.epam.rd.facades;

import com.epam.rd.dto.UserDto;

public interface UserFacade {
    UserDto findUserByEmail(String email);
}
