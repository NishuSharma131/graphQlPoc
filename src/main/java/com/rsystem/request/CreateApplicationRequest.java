package com.rsystem.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class CreateApplicationRequest {

	private String appcode;

	private String app_name;

	private String app_description;

	private String country;

	private String concept;

	private List<CreateUserRequest> allUsers;

	public String getAppcode() {
		return appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public String getApp_description() {
		return app_description;
	}

	public void setApp_description(String app_description) {
		this.app_description = app_description;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getConcept() {
		return concept;
	}

	public void setConcept(String concept) {
		this.concept = concept;
	}

	public List<CreateUserRequest> getAllUsers() {
		return allUsers;
	}

	public void setAllUsers(List<CreateUserRequest> allUsers) {
		this.allUsers = allUsers;
	}
	
	
	
}
