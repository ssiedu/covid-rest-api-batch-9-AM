package com.ssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.entity.Covid;
import com.ssi.service.CovidService;

@RestController
@RequestMapping("covidapi")
public class CovidController {
	
	@Autowired
	private CovidService covidService;
	
	//@RequestMapping(value="/covid", method=RequestMethod.GET)
	@GetMapping(value="covid", produces="application/json")
	public List<Covid> getAllStateData(){
		return covidService.getDataForAllStates();
	}
}
