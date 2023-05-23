package com.spring.playerapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//localhost8080:spring-crm-rest
@RestController
@RequestMapping("/api")
//localhost:8080/spring-crm-rest/api/
public class PlayerController {
	
	
	//localhost:8080/spring-crm-rest/api/data
	@GetMapping("/data")
	public String getData()	{
		
		return"mydata";
	}
	

}
