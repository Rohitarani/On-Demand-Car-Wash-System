package com.cg.CarWash.Entity;

import java.time.LocalDate;

public class Transaction {

	private long transaccountId;
	private double transAmount;
	private LocalDate transDate;
	private User user = new User();
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
