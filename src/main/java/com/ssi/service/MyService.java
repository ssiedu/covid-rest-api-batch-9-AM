package com.ssi.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.ssi.entity.Company;

@Service
public class MyService {
	public String getDateAndTime() {
		Date dt=new Date();
		return dt.toString();
	}
	public Company companyInfo() {
		Company company=new Company();
		company.setCompanyName("Xyz Ltd.");
		company.setCompanyAddress("Palasia, Indore");
		return company;
		//return company.toString();
	}
}
