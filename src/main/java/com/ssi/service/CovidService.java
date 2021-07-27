package com.ssi.service;

import java.util.List;

import com.ssi.entity.Covid;

public interface CovidService {
	public Covid getDataById(int id);
	public List<Covid> getDataForAState(String state);
	public List<Covid> getDataForAllStates();
	public Covid addInfo(Covid covid);
	public Covid updateInfo(Covid covid);
	public Covid deleteInfo(int id);
}
