package com.cg.CarWash.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "washCategory")
public class WashCategory {
@Id
	private String categoryId;
	private String categoryName;
	private BookingInfo user = new BookingInfo();
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public BookingInfo getUser() {
		return user;
	}
	public void setUser(BookingInfo user) {
		this.user = user;
	}
	
}
