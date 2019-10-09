package com.example.stack.Stack.Dao;

import com.example.stack.Stack.Entity.Publish;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PublishRepository extends MongoRepository <Publish, Long> {

}
