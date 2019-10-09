package com.example.stack.Stack.Dao;

import com.example.stack.Stack.Entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question,Integer> {
}
