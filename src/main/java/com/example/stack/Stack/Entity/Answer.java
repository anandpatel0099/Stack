package com.example.stack.Stack.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection="publish")
public class Answer {

    @Transient
    public static final String SEQUENCE_NAME = "users_sequence";
    @Id
    private long id;

    private String answer;

    List<Comment> comments;

    public Answer(){}

    public Answer(int id, String answer, List<Comment> comments) {
        this.id = id;
        this.answer = answer;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                ", comments=" + comments +
                '}';
    }
}
