package com.example.stack.Stack.Service;

import com.example.stack.Stack.Dao.PublishRepository;
import com.example.stack.Stack.Entity.Publish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishServiceImpl implements PublishService {

    @Autowired
    PublishRepository publishRepository;

    @Override
    public void createPublish(Publish publish) {
        publishRepository.save(publish);
    }

    @Override
    public List<Publish> findAll() {
        return publishRepository.findAll();
    }


}
