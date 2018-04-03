package com.epam.rd.controllers;

import com.epam.rd.dto.UserDto;
import com.epam.rd.facades.DefaultUserFacade;
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

    @GetMapping("/user/{id}")
    @ApiMethod(description = "Get user by id")
    public @ResponseBody
    ResponseEntity<?> findUserById(@PathVariable("id") Long id) {
        UserDto userDto = userFacade.findUserById(id);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }

    @PostMapping("/user/")
    @ApiMethod(description = "Create new user")
    public ResponseEntity createUser(@RequestBody UserDto dto) {
        UserDto resp = userFacade.createUser(dto);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    @ApiMethod(description = "Update user by id")
    public ResponseEntity updateUserById(@PathVariable("id") Long id, @RequestBody UserDto dto) {
        UserDto resp = userFacade.updateUser(id, dto);
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    @ApiMethod(description = "Delete user by id")
    public @ResponseBody ResponseEntity<?> deleteUserById(@PathVariable("id") Long id) {
        userFacade.deleteUserById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/userprofile/{email}")
    @ApiMethod(description = "Get userprofile by email")
    public @ResponseBody ResponseEntity<?> findUserByEmail(@Email @PathVariable("email") String email) {
        UserDto userDto = userFacade.findUserByEmail(email);
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}
