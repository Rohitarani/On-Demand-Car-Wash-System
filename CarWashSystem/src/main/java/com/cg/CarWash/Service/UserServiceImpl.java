package com.cg.CarWash.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.CarWash.Dao.CarWashDao;
import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.User;

@Service("customerser")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private CarWashDao dao;
	@Override
	public String addUser(UserForm userform) {
		User user = new User();
		
		user.setUserName(userform.getUserName());
		//user.setUserContact(userform.getUserContact());
		user.setEmail(userform.getEmail());
		user.setPasssword(userform.getPasssword());
		user.setRole(userform.getRole());
		
		dao.addUser(user);
		return "added";
		
	}
	@Override
	public List<User> viewAllUsers() {
		List<User>  allusers= dao.viewAllUsers();
		
		
		return allusers;
			
	}
	@Override
	public User updateUser(User user) {
		return dao.updateUser(user);
	}
}
