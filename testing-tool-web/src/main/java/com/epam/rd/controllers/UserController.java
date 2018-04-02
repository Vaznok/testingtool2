package com.epam.rd.controllers;

import com.epam.rd.data.access.domain.User;
import com.epam.rd.dto.UserDto;
import com.epam.rd.facades.DefaultUserFacade;
import com.epam.rd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private DefaultUserFacade userFacade;

    @GetMapping("/users")
    public String findAllUsers() {
      return userService.findAll().toString();
    }

    @GetMapping("/user/{email}")
    public @ResponseBody
    ResponseEntity<?> findUserByEmail(@Email @PathVariable("email") String email) {
        UserDto userDto = userFacade.findUserByEmail(email);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

}
