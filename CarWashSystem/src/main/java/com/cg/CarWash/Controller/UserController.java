package com.cg.CarWash.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cg.CarWash.Dto.AccountMessage;
import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Service.UserService;


@RestController
@RequestMapping(value = "/")
public class UserController {
	@Autowired
	private UserService service;

 
@CrossOrigin
	@PostMapping("/adduser")
	public AccountMessage addCustomer(@RequestBody UserForm userForm)  {
		
			String custID = service.addUser(userForm);
			
			
		    return new AccountMessage("created"+ custID);
	   
	}
}
