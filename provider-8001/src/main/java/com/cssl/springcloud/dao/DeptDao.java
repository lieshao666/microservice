package com.cssl.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeptDao{
	//查询所有用户
	public List<Users> getAllUser();
	//登录
	public Users login(@Param("userName")String userName,@Param("passWord")String passWord);
}
