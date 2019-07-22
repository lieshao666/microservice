package com.cssl.springcloud.controller;

import com.cssl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController{
	
	@Autowired
	private DeptService service;

	@RequestMapping("/getall")
	@ResponseBody
	public List<Users> findAll(){
		System.out.println("进入控制器！");
		List<Users> list = service.findAll();
		return list;
	}

	@RequestMapping("/login")
	public Users login(Users users){
		return service.login(users.getUserName(),users.getPassWord());
	}

	
}
