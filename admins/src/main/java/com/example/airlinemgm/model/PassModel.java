package com.example.airlinemgm.model;

public class PassModel {
	int profile_id;
	
	String password;

	public int getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PassModel(int profile_id, String password) {
		super();
		this.profile_id = profile_id;
		this.password = password;
	}
	
	public PassModel() {
		// TODO Auto-generated constructor stub
	}

}
