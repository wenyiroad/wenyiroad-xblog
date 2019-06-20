package com.wenyiroad.xblog.controller;

import com.wenyiroad.xblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("test")
    public Object test(){
        return "12344sqwdwd!";
    }

    @GetMapping("findAll")
    public Object findAll(){
        return userService.findAll();
    }

}
