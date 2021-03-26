package com.cg.CarWash.Dao;

import java.util.List;

import com.cg.CarWash.Entity.User;

public interface CarWashDao {
	public boolean addUser(User user);
	//public boolean viewUser(User user);
	List<User> viewAllUsers();
	//public boolean updateUserInfo(User userInfo);
	public User updateUser(User user);
	//public boolean deleteUser(User user);
	//public boolean editUser(User user);
	//public User viewUser(String userId);
	
}
