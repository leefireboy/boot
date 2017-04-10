package com.libing.web;

import com.libing.entity.User;
import com.libing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by libing on 2017/4/8.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/user")
    public User getUser() {
        return userService.getUserInfo();
    }

}
