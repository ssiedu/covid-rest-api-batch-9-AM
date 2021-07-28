package com.ssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.entity.Covid;
import com.ssi.service.CovidService;

@RestController
@RequestMapping("covidapi")
public class CovidController {
	
	@Autowired
	private CovidService covidService;
	
	//api for deleting a resource
	@DeleteMapping(value="covid/{id}", produces="application/json")
	public Covid removeData(@PathVariable("id") int id) {
		return covidService.deleteInfo(id);
	}
	
	//api for updating a resource
	@PutMapping(value="covid", consumes="application/json", produces="application/json")
	public Covid updateCovidInfo(Covid covid) {
		return covidService.updateInfo(covid);
	}
	
	//api for adding new data 
	@PostMapping(value="covid", consumes="application/json", produces="application/json")
	public Covid addNewCovidInfo(@RequestBody Covid covid) {
		return covidService.addInfo(covid);
	}
		
	//api for getting data for a particular state and particular year
	@GetMapping(value="covid/{state}/{year}",produces="application/json")
	public List<Covid> getDataForAStateAndYear(@PathVariable("state") String state, @PathVariable("year") int year) {
		List<Covid> covidList=covidService.getDataForAStateAndYear(state,year);
		return covidList;
	}
	//api for gettign data for a particular state
	@GetMapping(value="covid/{st}",produces="application/json")
	public List<Covid> getDataForAState(@PathVariable("st") String state) {
		List<Covid> covidList=covidService.getDataForAState(state);
		return covidList;
	}
	//api for get data of all state
	@GetMapping(value="covid", produces="application/json")
	public List<Covid> getAllStateData(){
		return covidService.getDataForAllStates();
	}
}
