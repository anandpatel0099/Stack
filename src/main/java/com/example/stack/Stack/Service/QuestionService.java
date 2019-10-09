package com.example.stack.Stack.Service;

import com.example.stack.Stack.Entity.Question;
import com.example.stack.Stack.Entity.User;

import java.util.List;

public interface QuestionService {
    public void saveQuestion(Question question);

    public List<Question> findAll();
}

