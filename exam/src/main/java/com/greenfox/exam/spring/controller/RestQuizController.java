package com.greenfox.exam.spring.controller;


import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class RestQuizController {

  @Autowired
  QuestionRepository questionRepository;

  @GetMapping("/questions")
  public Iterable<Question> getQuestion() {
    return questionRepository.findAll();
  }
}


//  @PostMapping ("/answers")
//  public Response getAnswer(@RequestBody ) {
//    questionRepository.save(meal);
//    return new Response("ok");}
