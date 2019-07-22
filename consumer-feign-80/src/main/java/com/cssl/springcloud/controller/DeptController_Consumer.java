package com.cssl.springcloud.controller;

import com.cssl.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DeptController_Consumer {
	
	@Autowired
	private DeptClientService service;



}
