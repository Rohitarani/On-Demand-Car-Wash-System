package com.cg.CarWash.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.CarWash.Dao.CarWashDao;
import com.cg.CarWash.Dto.BookingForm;
import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Entity.WashCategory;

@Service("bookingser")
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	private CarWashDao dao;
	@Override
	public String addBooking(BookingForm bookingform) {
		Booking booking = new Booking();
		
		booking.setCarName(bookingform.getCarName());
		booking.setCarModel(bookingform.getCarModel());
		booking.setCarNumber(bookingform.getCarNumber());
		booking.setCarSeater(bookingform.getCarSeater());
		booking.setUser(bookingform.getUser());
		booking.setCategory(bookingform.getCategory());
		booking.setContact(bookingform.getContact());
		booking.setCountry(bookingform.getCountry());
		booking.setCity(bookingform.getCity());
		booking.setPincode(bookingform.getPincode());
		booking.setDate(bookingform.getDate());
		booking.setTime(bookingform.getTime());
		
		dao.addBooking(booking);
		return "added";
	}
	@Override
	public List<Booking> viewAllBooking() {
List<Booking>  allbooking= dao.viewAllBooking();
		
		
		return allbooking;
	}
	
	@Override
	public List<Booking> viewBooking(String userId) {
		List<Booking> accList = dao.viewBooking(userId);// TODO Auto-generated method stub
		return accList;
	}

	
}
