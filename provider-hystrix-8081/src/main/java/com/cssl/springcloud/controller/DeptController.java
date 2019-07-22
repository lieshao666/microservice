package com.cssl.springcloud.controller;

import com.cssl.pojo.Dept;
import com.cssl.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class DeptController {
	
	@Autowired
	private DeptService service;
	
	@GetMapping("/dept/list")
	public List<Dept> list(HttpSession session){
		System.out.println("sessionId:"+session.getId());
		return service.list();
	}

	@GetMapping("/dept/get/{id}")
	//调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用指定方法
	@HystrixCommand(fallbackMethod = "hystrix")
	public Dept get(@PathVariable("id") Long id){
		Dept dept = this.service.get(id);
		
		if (dept == null) {
			throw new RuntimeException("该ID："+id+"不存在");
		}
		
		return dept;
	}
	
	public Dept hystrix(@PathVariable("id") Long id)	{
		System.out.println("hystrix:"+id);
		return new Dept().setDeptno(id).setDname("该ID："+id+"不存在对应信息").setDb("no database");
	}

}
