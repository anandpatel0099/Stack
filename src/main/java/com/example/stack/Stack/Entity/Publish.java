package com.example.stack.Stack.Entity;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document(collection="publish")
public class Publish {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    @Id
   private long id;
    Question question;
    List<Answer> answers;


    //List<Answer> answers = new ArrayList<>();

    public Publish(){}

    public Publish(long id, Question question, List<Answer> answers) {
        this.id = id;
        this.question = question;
        this.answers = answers;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Publish{" +
                "id=" + id +
                ", question=" + question +
                ", answers=" + answers +
                '}';
    }
}
