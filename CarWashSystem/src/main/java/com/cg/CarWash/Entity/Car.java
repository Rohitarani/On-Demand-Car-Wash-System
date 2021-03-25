package com.cg.CarWash.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection = "car")
public class Car {
	@Id
	private String carName;
	private Integer carSeater;
	private String carNumber;
	private String CarModel;
	private User user = new User();
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
