package com.cssl.springcloud.dao;

import java.util.List;
import com.cssl.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public List<User> getuser();
}
