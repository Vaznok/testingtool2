package com.epam.rd.controllers;

import com.epam.rd.dto.UserDto;
import com.epam.rd.facades.DefaultUserFacade;
import com.epam.rd.services.UserService;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;
import java.util.List;

@RestController
@Api(name = "Users API", description = "Provides a list of methods that manage user", stage = ApiStage.ALPHA)
public class UserController {

    @Autowired
    private DefaultUserFacade userFacade;

    @GetMapping("/users")
    @ApiMethod(description = "Get users")
    public List<UserDto> findAllUsers() {
        return userFacade.findAll();
    }

    @GetMapping("/user/{email}")
    @ApiMethod(description = "get user by email")
    public @ResponseBody
    ResponseEntity<?> findUserByEmail(@Email @PathVariable("email") String email) {
        UserDto userDto = userFacade.findUserByEmail(email);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

}
