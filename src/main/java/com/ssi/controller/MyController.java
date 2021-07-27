package com.ssi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.entity.Company;
import com.ssi.service.MyService;

@RestController
@RequestMapping("myapis")
public class MyController {

	@Autowired
	private MyService myService;
	
	@RequestMapping(value="info",produces="application/xml")
	public Company companyInfo() {
		return myService.companyInfo();
	}
	
	@RequestMapping("now")
	public String dateTimeService() {
		return myService.getDateAndTime(); 
	}
	
}
