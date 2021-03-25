package com.cg.CarWash.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Repository.UserRepository;

@RestController
@RequestMapping(value = "/")
public class UserController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

@RequestMapping(value = "/create", method = RequestMethod.POST)
public User addNewUsers(@RequestBody User user) {
	LOG.info("Saving user.");
	return userRepository.save(user);
}
}
