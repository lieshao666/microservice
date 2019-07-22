package com.cssl.springcloud.service;

import java.util.List;

public interface DeptService{

	public List<Users> findAll();

	public Users login(String userName, String passWord);
}
