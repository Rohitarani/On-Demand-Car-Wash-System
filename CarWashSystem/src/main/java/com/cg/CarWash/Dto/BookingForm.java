package com.cg.CarWash.Dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Entity.WashCategory;

public class BookingForm {
	private String bookingId;
	private String carName;
	private Integer carSeater;
	private String carNumber;
	private String CarModel;
	private WashCategory category = new WashCategory();
	private User user=new User();
	private String contact;
	private String city;
	private String country;
	private String addressLine1;
	private String pincode;
	private LocalDate date;
	private LocalTime time;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Integer getCarSeater() {
		return carSeater;
	}
	public void setCarSeater(Integer carSeater) {
		this.carSeater = carSeater;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public WashCategory getCategory() {
		return category;
	}
	public void setCategory(WashCategory category) {
		this.category = category;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
