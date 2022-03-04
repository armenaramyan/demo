package com.test.controller;

import com.test.model.DemoUsers;
import com.test.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/get-all")
    List<DemoUsers> findAll() {
        return usersService.findAll();
    }

    @PostMapping
    void saveUser(@RequestBody DemoUsers demoUsers) {
        usersService.createUsers(demoUsers);
    }
}
