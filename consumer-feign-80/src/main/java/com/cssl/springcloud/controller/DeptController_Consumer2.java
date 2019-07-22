package com.cssl.springcloud.controller;

import com.cssl.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController_Consumer2 {
	
	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/list")
	public String list(Model model){
		System.out.println("/list");
		model.addAttribute("user","admin");
		//return "forward:/success.html";
		return "success";
	}


}
