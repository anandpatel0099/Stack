package com.example.stack.Stack.Entity;

import org.bson.BsonInt64;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.lang.annotation.Documented;

@Document(collection="publish")
public class User {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;

    private boolean flag;

    @Indexed
    private String email;

    private String firstName;

    private String lastName;

    private String password;

    private String technology;

    public User(){

    }

    public User(long id, boolean flag, String email, String firstName, String lastName, String password, String technology) {
        this.id = id;
        this.flag = flag;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.technology = technology;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", flag=" + flag +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
}
