package com.cg.CarWash.Dao;

import com.cg.CarWash.Entity.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarWashDaoImpl implements CarWashDao {
	@Autowired
	private MongoTemplate mongoTemplate;
	@Override
	public boolean addUser(User user) {
		mongoTemplate.save(user);
		// Now, user object will contain the ID as well
		return true;
	}
}
