package com.cssl.springcloud.controller;

import com.cssl.pojo.User;
import com.cssl.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    @ResponseBody
    public List<User> getUsers(){
        List<User> list = userService.getUser();
        return  list;
    }
}
