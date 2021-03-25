package com.cg.CarWash.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "booking")
public class Booking {
	@Id
private String bookingId;
private WashCategory category = new WashCategory();
private User user = new User();
public String getBookingId() {
	return bookingId;
}
public void setBookingId(String bookingId) {
	this.bookingId = bookingId;
}
public WashCategory getCategory() {
	return category;
}
public void setCategory(WashCategory category) {
	this.category = category;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}

}
