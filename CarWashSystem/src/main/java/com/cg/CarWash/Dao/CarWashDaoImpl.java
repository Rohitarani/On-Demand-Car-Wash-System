package com.cg.CarWash.Dao;

import com.cg.CarWash.Entity.Booking;
import com.cg.CarWash.Entity.User;
import com.cg.CarWash.Entity.WashCategory;

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
	
	
	//////////////////////////////////////////////////////////......................................................
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
        update.set("password",user.getPasssword());
       
        update.set("email", user.getEmail());
        return mongoTemplate.findAndModify(query, update, User.class);// TODO Auto-generated method stub
		
	}

	
	///////////////////////////////////////////.........................................................
	
	
	@Override
	public boolean addBooking(Booking booking) {
		mongoTemplate.save(booking);
		// Now, user object will contain the ID as well
		return true;
	}

	@Override
	public List<Booking> viewAllBooking() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Booking.class);
	}

	
	////////////////////////////..............................................................................
	
	
	@Override
	public boolean addCategory(WashCategory category) {
		mongoTemplate.save(category);
		// Now, user object will contain the ID as well
		return true;
	}

	@Override
	public List<WashCategory> viewAllCategories() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(WashCategory.class);
	}
	
	

	@Override
	public Booking viewBookingByUserId(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		return mongoTemplate.findOne(query, Booking.class);
	}
	
	@Override
	public List<Booking> viewBooking(String userId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(userId));
		//query.setParameter("custid", userId);
		return (List<Booking>) mongoTemplate.findOne(query, Booking.class);
		
		
	}
}
