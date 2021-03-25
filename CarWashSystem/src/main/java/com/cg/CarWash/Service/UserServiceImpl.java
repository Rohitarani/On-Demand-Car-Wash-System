package com.cg.CarWash.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.CarWash.Dao.CarWashDao;
import com.cg.CarWash.Dto.UserForm;
import com.cg.CarWash.Entity.User;

@Service("customerser")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private CarWashDao dao;
	@Override
	public String addUser(UserForm userform) {
		User user = new User();
		//user.setUserId();
		user.setUserName(userform.getUserName());
		user.setUserContact(userform.getUserContact());
		user.setEmail(userform.getEmail());
		user.setCountry(userform.getCountry());
		user.setCity(userform.getCity());
		user.setAddressLine1(userform.getAddressLine1());
		user.setPincode(userform.getPincode());
		dao.addUser(user);
		return "added";
		
	}
}
