package com.cg.CarWash.Dao;

import java.util.List;

import com.cg.CarWash.Entity.BookingInfo;

public interface CarWashDao {
	public boolean addUser(BookingInfo user);
	//public boolean viewUser(User user);
	List<BookingInfo> viewAllUsers();
	//public boolean updateUserInfo(User userInfo);
	public BookingInfo updateUser(BookingInfo user);
	//public boolean deleteUser(User user);
	//public boolean editUser(User user);
	//public User viewUser(String userId);
	
}
