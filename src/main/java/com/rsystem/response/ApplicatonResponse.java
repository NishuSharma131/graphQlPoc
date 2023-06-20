package com.rsystem.response;

import com.rsystem.model.Application;

import java.util.List;

public class ApplicatonResponse {


	private int appid;
	private String appcode;
	private String app_name;
	private String app_description;
	private String country;
	private String concept;
	private List<UserResponse> allUsers;
	
	
	public ApplicatonResponse(Application application) {
		this.appid=application.getAppid();
		this.appcode=application.getAppcode();
		this.app_name=application.getApp_name();
		this.app_description=application.getApp_description();
		this.country=application.getCountry();
		this.concept=application.getConcept();
		
//		if (application.getListOfUsers() != null) {
//			allUsers = new ArrayList<UserResponse>();
//			for (User appUser: application.getListOfUsers()) {
//				allUsers.add(new UserResponse(appUser));
//			}
//		}
		
	}


	public int getAppid() {
		return appid;
	}


	public void setAppid(int appid) {
		this.appid = appid;
	}


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


	public List<UserResponse> getAllUsers() {
		return allUsers;
	}


	public void setAllUsers(List<UserResponse> allUsers) {
		this.allUsers = allUsers;
	}
	
	
	
}
