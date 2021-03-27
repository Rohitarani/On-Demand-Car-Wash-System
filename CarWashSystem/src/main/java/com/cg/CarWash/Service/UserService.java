package com.cg.CarWash.Service;

import java.util.List;

import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.BookingInfo;


public interface UserService {
	public String addUser(UserForm userform);
	//public String viewAllUsers(UserForm userform);
	public List<BookingInfo> viewAllUsers() ;
	public BookingInfo updateUser(BookingInfo user) ;
}
