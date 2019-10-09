package com.example.stack.Stack.Entity;

//import javax.persistence.*;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection="publish")
public class Question {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;
   // private ObjectId userId;
  //  private int numOfAns;
    private String questionDetail;

    List<Comment> comments;

    public Question(){}

    public Question(int id, String questionDetail, List<Comment> comments) {
        this.id = id;
        this.questionDetail = questionDetail;
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
// public ObjectId getUserId() {
     //   return userId;
   // }

    //public void setUserId(ObjectId userId) {
    //    this.userId = userId;
   // }

//    public int getNumOfAns() {
//        return numOfAns;
//    }

//    public void setNumOfAns(int numOfAns) {
//        this.numOfAns = numOfAns;
//    }

    public String getQuestionDetail() {
        return questionDetail;
    }

    public void setQuestionDetail(String questionDetail) {
        this.questionDetail = questionDetail;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionDetail='" + questionDetail + '\'' +
                ", comments=" + comments +
                '}';
    }
}
