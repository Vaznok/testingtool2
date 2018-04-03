package com.epam.rd.dto;


import com.epam.rd.data.access.domain.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructUserConverter {

    UserDto userToUserDto(User user);

    List<UserDto> userListToUserDtoList(List<User> userList);

    User userDtoToUser(UserDto userDto);

}