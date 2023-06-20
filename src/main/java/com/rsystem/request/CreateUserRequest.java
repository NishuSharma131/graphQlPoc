package com.rsystem.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class CreateUserRequest {

	private String userid;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	
}
