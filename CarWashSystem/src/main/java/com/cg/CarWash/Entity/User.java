package com.cg.CarWash.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class User {
@Id
private String userId;
private String email;
private String userName;
private String passsword;
private String role;



public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPasssword() {
	return passsword;
}
public void setPasssword(String passsword) {
	this.passsword = passsword;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
