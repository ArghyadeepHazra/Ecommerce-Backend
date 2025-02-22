package com.arghyadeep.bestseller.backend.controller;

import org.springframework.web.bind.annotation.*;
import com.arghyadeep.bestseller.backend.model.UserData;

@RestController
@RequestMapping("/user")
public class UserDataReturn {
    @GetMapping
    public UserData getUserData(@RequestParam String name ) {
        UserData user = new UserData();
        user.name = name;
        return user;
    }
    @PostMapping("/UserByPost")
    public  UserData getUserData(@RequestBody UserData user) {
        user.name = user.name+"Returned From Post Call";
        return user;
    }
}
