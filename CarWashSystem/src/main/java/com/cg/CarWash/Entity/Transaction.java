package com.cg.CarWash.Entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection = "transaction")
public class Transaction {
@Id
	private long transaccountId;
	private double transAmount;
	private LocalDate transDate;
	private Booking user = new Booking();
	public long getTransaccountId() {
		return transaccountId;
	}
	public void setTransaccountId(long transaccountId) {
		this.transaccountId = transaccountId;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public LocalDate getTransDate() {
		return transDate;
	}
	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}
	public Booking getUser() {
		return user;
	}
	public void setUser(Booking user) {
		this.user = user;
	}
}
