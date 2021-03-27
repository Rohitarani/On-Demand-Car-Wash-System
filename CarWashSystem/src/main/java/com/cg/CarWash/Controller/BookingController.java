package com.cg.CarWash.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.CarWash.Dto.AccountMessage;
import com.cg.CarWash.Dto.BookingForm;
import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Service.BookingService;
import com.cg.CarWash.Service.UserService;

@RestController
@RequestMapping(value = "/")
public class BookingController {

	@Autowired
	private BookingService bookservice;
	
	@CrossOrigin
	@PostMapping("/dobooking")
	public AccountMessage addCustomer(@RequestBody BookingForm bookingform)  {
		
			String custID = bookservice.addBooking(bookingform);
			
			
		    return new AccountMessage("done"+ custID);
	   
	}

@GetMapping("/viewAllBooking")
public List<Booking> viewAllBooking() {
	return bookservice.viewAllBooking();
}

@CrossOrigin
@GetMapping("/viewbookingbyuserid/{userid}")
public List<Booking> viewBooking(@PathVariable("userid") String UserId) {
	return bookservice.viewBooking(UserId);
}
}
