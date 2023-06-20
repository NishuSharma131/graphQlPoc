package com.rsystem.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.rsystem.model.User;
import com.rsystem.request.CreateApplicationRequest;
import com.rsystem.response.ApplicatonResponse;
import com.rsystem.response.UserResponse;
import com.rsystem.service.ApplicationService;
import com.rsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mutation implements GraphQLMutationResolver{
	
	@Autowired
	private UserService userService;
	@Autowired
	ApplicationService applicationService;
	
	public UserResponse createUser(User user) {
		return new UserResponse(userService.createUser(user));
		
	}
	
	public ApplicatonResponse createApp (CreateApplicationRequest createApplicationRequest) {
		return new ApplicatonResponse(applicationService.createApp(createApplicationRequest));
	}

}
