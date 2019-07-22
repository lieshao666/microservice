package com.cssl.springcloud.service;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/*
 *  服务降级回调类
 */
@Component 
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
	@Override
	public DeptClientService create(Throwable throwable){
		
		return new DeptClientService() {
			
			@Override
			public Users login(Users users){
				return new Users().setUserName("Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
			}


		};
	}
}
