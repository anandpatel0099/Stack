package com.example.stack.Stack.Controller;

import com.example.stack.Stack.Entity.Answer;
import com.example.stack.Stack.Entity.Comment;
import com.example.stack.Stack.Entity.Publish;
import com.example.stack.Stack.Entity.Question;
import com.example.stack.Stack.Service.PublishService;
import com.example.stack.Stack.Service.SequenceGeneratorService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PublishController {

    @Autowired
    PublishService publishService;
    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    @GetMapping("/seePublish")
    public List<Publish> findAll(){

    // List<Publish> publishes = new ArrayList<>();

      return publishService.findAll();
       // return publishes;
    }

    @PostMapping("/publish")
    public String create (@RequestBody Publish publish){


        publish.setId(sequenceGeneratorService.generateSequence(Publish.SEQUENCE_NAME));
        publish.getQuestion().setId(sequenceGeneratorService.generateSequence(Answer.SEQUENCE_NAME));
        publish.getQuestion().getComments().get(0).setId(sequenceGeneratorService.generateSequence(Question.SEQUENCE_NAME));
        publish.getAnswers().get(0).setId(sequenceGeneratorService.generateSequence(Answer.SEQUENCE_NAME));
        publish.getAnswers().get(0).getComments().get(0).setId(sequenceGeneratorService.generateSequence(Answer.SEQUENCE_NAME));

        publishService.createPublish(publish);
        return "Published";
    }
}
