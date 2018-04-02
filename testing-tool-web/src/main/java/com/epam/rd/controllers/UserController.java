package com.epam.rd.controllers;

import com.epam.rd.dto.UserDto;
import com.epam.rd.facades.DefaultUserFacade;
import com.epam.rd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Email;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private DefaultUserFacade userFacade;
    @GetMapping("/users")
    public String findAllUsers() {
      return userService.findAll().toString();
    }
    @GetMapping("/user/{email}")
    public @ResponseBody
        UserDto userDto = userFacade.findUserByEmail(email);
    ResponseEntity<?> findUserByEmail(@Email @PathVariable("email") String email) {
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
