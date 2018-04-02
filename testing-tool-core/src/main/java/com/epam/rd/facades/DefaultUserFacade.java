package com.epam.rd.facades;

import com.epam.rd.dto.MapStructUserConverter;
import com.epam.rd.dto.UserDto;
import com.epam.rd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserFacade implements UserFacade {

    @Autowired
    private UserService userService;

    @Autowired
    private MapStructUserConverter userConverter;

    @Override
    public List<UserDto> findAll() {
        return userConverter.userListToUserDtoList(userService.findAll());
    }

    @Override
    public UserDto findUserByEmail(String email) {
        return userConverter.userToUserDto(userService.findUserByEmail(email));
    }
}
