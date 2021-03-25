package com.cg.CarWash.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cg.CarWash.Entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}