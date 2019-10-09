package com.example.stack.Stack.Service;

import com.example.stack.Stack.Dao.QuestionRepository;
import com.example.stack.Stack.Entity.Question;
import com.example.stack.Stack.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;



    @Override
    public void saveQuestion(Question question) {
    questionRepository.save(question);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }
}
