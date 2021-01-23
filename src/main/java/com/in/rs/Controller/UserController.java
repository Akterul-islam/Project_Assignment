package com.in.rs.Controller;

import com.in.rs.Model.Dto.UserDto;
import com.in.rs.Model.Dto.UserTypeDto;
import com.in.rs.Model.Entity.User;
import com.in.rs.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/createNewUser")
    public User createNewUser(@RequestBody UserDto userDto) {
     return userService.createNewUser(userDto);
    }

    @PostMapping(value = "createUserRole")
    public void createUserRole(@RequestBody UserTypeDto userTypeDto) {
        userService.createUserRole(userTypeDto);
    }
}
