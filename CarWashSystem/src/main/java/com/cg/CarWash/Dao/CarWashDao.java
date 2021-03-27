package com.cg.CarWash.Dao;

import java.util.List;

import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Entity.WashCategory;

public interface CarWashDao {
	
	public boolean addUser(User user);
	List<User> viewAllUsers();
	public User updateUser(User user);
	
	
	public boolean addBooking(Booking booking);
	List<Booking> viewAllBooking();
	public Booking viewBookingByUserId(String userId);
	//public Booking getbookingByuserId(String userId);
	public List<Booking> viewBooking(String userId);
	
	
	public boolean addCategory(WashCategory category);
	List<WashCategory> viewAllCategories();
}
