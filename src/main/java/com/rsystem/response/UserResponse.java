package com.rsystem.response;

import com.rsystem.model.User;

public class UserResponse {

	
	private int appid;
	private String userid;
	
	public UserResponse(User user) {
		this.appid=user.getAppid();
		this.userid=user.getUserid();
		
		
	}

	public int getAppid() {
		return appid;
	}

	public void setAppid(int appid) {
		this.appid = appid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
}
