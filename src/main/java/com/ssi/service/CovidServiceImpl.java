package com.ssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.entity.Covid;
import com.ssi.repo.CovidRepo;

@Service
public class CovidServiceImpl implements CovidService{

	@Autowired
	private CovidRepo covidRepo;
	
	public Covid getDataById(int id) {
		return covidRepo.getDataById(id);
	}

	public List<Covid> getDataForAState(String state) {
		return covidRepo.getDataForAState(state);
	}

	public List<Covid> getDataForAllStates() {
		return covidRepo.getDataForAllStates();
	}

	public Covid addInfo(Covid covid) {
		return covidRepo.addInfo(covid);
	}

	public Covid updateInfo(Covid covid) {
		return covidRepo.updateInfo(covid);
	}

	public Covid deleteInfo(int id) {
		return covidRepo.deleteInfo(id);
	}

}
