package com.example.stack.Stack.Dao;

import com.example.stack.Stack.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
}
