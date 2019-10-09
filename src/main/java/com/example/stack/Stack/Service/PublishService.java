package com.example.stack.Stack.Service;

import com.example.stack.Stack.Entity.Publish;

import java.util.List;

public interface PublishService {

    public void createPublish(Publish publish);
    public List<Publish> findAll();
}

