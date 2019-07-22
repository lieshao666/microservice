package com.cssl.springcloud.controller;

import com.cssl.pojo.Dept;
import com.cssl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController{
	
	@Autowired
	private DeptService service;

	@PostMapping("/dept/add")
	public boolean add(@RequestBody Dept dept){
		return service.add(dept);
	}

	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id){
		return service.get(id);
	}

	@GetMapping("/dept/list")
	public List<Dept> list(){
		System.out.println("8002");
		return service.list();
	}

	
}
