package com.example.stack.Stack.Controller;

import com.example.stack.Stack.Entity.Question;
import com.example.stack.Stack.Entity.User;
import com.example.stack.Stack.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/{id}/question")
    public ResponseEntity<Object> addQuestion(@PathVariable Long id, @Valid @RequestBody Question question , BindingResult result) {
        if(question==null ){
     //       throw new BadRequestException("Path variable postId cound not be null.");
        }
        questionService.saveQuestion(question);
        addQuestion()
        if (null == comment) {
            throw new ResourceNotFoundException("New comment object can't be created.");
        }
        URI location = ServletUriComponentsBuilder.
                fromCurrentRequest().
                path("/{id}").
                buildAndExpand(question.getId()).
                toUri();
        return  ResponseEntity.created(location).build();
    }


}
