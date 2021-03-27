package com.cg.CarWash.Service;

import java.util.List;

import com.cg.CarWash.Dto.BookingForm;
import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.User;


public interface BookingService {
	public String addBooking(BookingForm bookingform);
	public List<Booking> viewAllBooking() ;
	public List<Booking> viewBooking(String userId) ;
}
