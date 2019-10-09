package com.example.stack.Stack.Service;

import com.example.stack.Stack.Entity.User;

import java.util.List;

public interface UserService {

    public void saveUser(User theUser);

    public List<User> findAll();
}
