package com.example.stack.Stack.Controller;

import com.example.stack.Stack.Entity.User;
import com.example.stack.Stack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.*;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> findAll(){
        List<User> list = new ArrayList<>();
        list = userService.findAll();
        return list;
    }
    @PostMapping("/register")
    public ResponseEntity<Object> addCustomer(@Valid @RequestBody User theUser , BindingResult result) {

        new UserRegistrationValidation().validate(theUser , result);

        if(result.hasErrors()){
            System.out.println(result.getFieldErrors());
            return new ResponseEntity<>(result.getFieldErrors(), HttpStatus.BAD_REQUEST);
        }

        else{
            userService.saveUser(theUser);
            URI location = ServletUriComponentsBuilder.
                    fromCurrentRequest().
                    path("/{id}").
                    buildAndExpand(theUser.getId()).
                    toUri();
            return  ResponseEntity.created(location).build();
        }


    }
}
