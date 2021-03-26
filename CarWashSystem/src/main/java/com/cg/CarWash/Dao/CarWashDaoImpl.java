package com.cg.CarWash.Dao;

import com.cg.CarWash.Entity.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.data.mongodb.repository.Query;
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
	
	@Override
	public List<User> viewAllUsers() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(User.class);
	}
	
	
	


	@Override
	public User updateUser(User user) {
		Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(user.getUserId()));
        Update update = new Update();
        update.set("userName", user.getUserName());
        update.set("userContact", user.getUserContact());
        update.set("email", user.getEmail());
        return mongoTemplate.findAndModify(query, update, User.class);// TODO Auto-generated method stub
		//return null;
	}
}
