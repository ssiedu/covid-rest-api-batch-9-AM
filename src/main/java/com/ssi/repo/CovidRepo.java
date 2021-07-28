package com.ssi.repo;

import java.util.List;

import com.ssi.entity.Covid;

public interface CovidRepo {
	public Covid getDataById(int id);
	public List<Covid> getDataForAState(String state);
	public List<Covid> getDataForAStateAndYear(String state, int year);
	public List<Covid> getDataForAllStates();
	public Covid addInfo(Covid covid);
	public Covid updateInfo(Covid covid);
	public Covid deleteInfo(int id);
}
