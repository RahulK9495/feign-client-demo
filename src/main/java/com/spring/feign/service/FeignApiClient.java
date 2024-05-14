package com.spring.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="DemoFeign",url="http://localhost:8082")
public interface FeignApiClient {

	@GetMapping(value="/hello")
	String getHello();
}
