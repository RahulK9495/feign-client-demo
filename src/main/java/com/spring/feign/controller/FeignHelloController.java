package com.spring.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feign.entity.Account;
import com.spring.feign.service.FeignApiClient;
import com.spring.feign.service.feignService;

@RestController
public class FeignHelloController {

	@Autowired
	feignService feignService;

	@GetMapping("/hellofeign")
	public String helloFeign() {
		return feignService.gethello();
	}

	@PostMapping("/createAccount")
	public Account createAccountC(@RequestBody Account account) {
		return feignService.createAccount(account);
	}
}
