package com.epam.rd.dto;


import com.epam.rd.data.access.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructUserConverter {
    UserDto userToUserDto(User user);

    User userDtoToUser(User user);
}
