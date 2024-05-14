package com.spring.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.feign.entity.Account;

@Service
public class feignService {

	@Autowired
	FeignApiClient apiClient;
	
	@Autowired
	feignBanking banking;



	public String gethello()
	{
		return apiClient.getHello();
	}
	
	public Account createAccount(Account account)
	{
		return banking.createAccount(account);
	}
}
