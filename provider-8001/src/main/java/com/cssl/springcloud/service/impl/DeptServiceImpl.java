package com.cssl.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cssl.springcloud.dao.DeptDao;
import com.cssl.springcloud.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao dao;

	@Override
	public Users login(String userName, String passWord) {
		Users users = dao.login(userName,passWord);
		return users;
	}

	@Override
	public List<Users> findAll() {
		List<Users> list = dao.getAllUser();
		return list;
	}

}
