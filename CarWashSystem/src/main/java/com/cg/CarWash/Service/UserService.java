package com.cg.CarWash.Service;

import java.util.List;

import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.User;


public interface UserService {
	public String addUser(UserForm userform);
	//public String viewAllUsers(UserForm userform);
	public List<User> viewAllUsers() ;
	public User updateUser(User user) ;
}
