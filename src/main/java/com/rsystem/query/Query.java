package com.rsystem.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.rsystem.request.Request;
import com.rsystem.response.ApplicatonResponse;
import com.rsystem.response.UserResponse;
import com.rsystem.service.ApplicationService;
import com.rsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private ApplicationService applicationService;
	
	@Autowired
	private UserService userService;
public String firstQuery() {
	return "first query";
}

public String fullName(String firstName,String lastName) 
{
return 	firstName+" "+lastName;
}

public String fullNameByRequest(Request request) 
{
return 	request.getFirstName()+" "+request.getLastName();
}

public ApplicatonResponse application(int appid) {
	return new ApplicatonResponse(applicationService.getApplicationById(appid));
}

public UserResponse user(int appid) {
	return new UserResponse(userService.getUserById(appid));
}


//public UserResponse getAllUser() {
//	return new UserResponse(userService.getAllUsers());
//}
}

