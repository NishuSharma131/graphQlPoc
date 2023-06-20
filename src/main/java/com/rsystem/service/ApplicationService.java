package com.rsystem.service;

import com.rsystem.model.Application;
import com.rsystem.model.User;
import com.rsystem.repository.ApplicationRepository;
import com.rsystem.repository.UserRepository;
import com.rsystem.request.CreateApplicationRequest;
import com.rsystem.request.CreateUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//defining the business logic
@Service
public class ApplicationService 
{
@Autowired
ApplicationRepository applicationRepository;

@Autowired
UserRepository userRepository;
//getting all Applications record by using the method findaAll() of CrudRepository
public List<Application> getAllApplications() 
{
List<Application> applications = new ArrayList<Application>();
applicationRepository.findAll().forEach(application -> applications.add(application));
return applications;
}
//getting a specific record by using the method findById() of CrudRepository
public Application getApplicationById(int appid) 
{
	Application application=new Application();
	application=applicationRepository.findById(appid).get();
	return application;
}
//saving a specific record by using the method save() of CrudRepository
public Application createApp(CreateApplicationRequest createApplicationRequest) 
{

	Application application=new Application(createApplicationRequest);
	application=applicationRepository.save(application);
	List<User> listOfAllUsers=new ArrayList<User>();
	if(createApplicationRequest.getAllUsers() != null) {
	for(CreateUserRequest userRequest:createApplicationRequest.getAllUsers() ) {
		User user=new User();
		user.setAppid(application.getAppid());
		user.setUserid(userRequest.getUserid());
		user.setApplication(application);
		listOfAllUsers.add(user);
	}
	userRepository.saveAll(listOfAllUsers);
	
	}

	application.setListOfUsers(listOfAllUsers);
	
	return application;
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
applicationRepository.deleteById(id);
}
//updating a record
public void update(Application Application, int appid) 
{
applicationRepository.save(Application);
}
}