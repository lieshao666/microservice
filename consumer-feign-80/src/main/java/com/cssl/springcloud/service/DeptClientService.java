package com.cssl.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient("MICROSERVICE-DEPT")
//当一个服务停止了，Consumer客户端提供降级信息
@FeignClient(value = "MICROSERVICE-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService{


}
