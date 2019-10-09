package com.example.stack.Stack.Controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.example.stack.Stack.Entity.User;





public class UserRegistrationValidation implements Validator {


private static final int MINIMUM_PASSWORD_LENGTH=6;

@Override
public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
        }

@Override
public void validate(Object target, Errors errors){


        User user=(User)target;
        String pass=user.getPassword();
        if(user.getPassword().trim().length()<MINIMUM_PASSWORD_LENGTH){
        errors.rejectValue("password","field.min.length",
        new Object[]{Integer.valueOf(MINIMUM_PASSWORD_LENGTH)},
        "The password must be at least ["+MINIMUM_PASSWORD_LENGTH+"] characters in length.");
        //  return;
        }
        }
}
