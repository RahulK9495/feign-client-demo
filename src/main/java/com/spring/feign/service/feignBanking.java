package com.spring.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.feign.entity.Account;



@FeignClient(value ="BankingAPI", url ="http://localhost:8080")
public interface feignBanking {

	@PostMapping("/banking/account")
	Account createAccount(@RequestBody Account account);
}
