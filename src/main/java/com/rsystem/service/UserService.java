package com.rsystem.service;

import com.rsystem.model.User;
import com.rsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//defining the business logic
@Service
public class UserService 
{
@Autowired
UserRepository userRepository;
//getting all users record by using the method findaAll() of CrudRepository
public List<User> getAllUsers() 
{
List<User> users = new ArrayList<User>();
userRepository.findAll().forEach(user -> users.add(user));
return users;
}
//getting a specific record by using the method findById() of CrudRepository
public User getUserById(int id) 
{
	User user=new User();
	user=userRepository.findById(id).get();
return user;
}
//saving a specific record by using the method save() of CrudRepository
public User createUser(User user) 
{
return userRepository.save(user);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
userRepository.deleteById(id);
}
//updating a record
public void update(User user, int appid) 
{
userRepository.save(user);
}
}