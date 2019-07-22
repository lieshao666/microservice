package com.cssl.springcloud.service.impl;

import com.cssl.pojo.User;
import com.cssl.springcloud.dao.UserMapper;
import com.cssl.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUser(){
        List<User> list = userMapper.getuser();
        return list;
    }


}
