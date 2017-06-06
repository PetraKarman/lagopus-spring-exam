package com.greenfox.exam.spring.controller;


import com.greenfox.exam.spring.model.Answers;
import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.model.Questions;
import com.greenfox.exam.spring.repository.AnswerRepository;
import com.greenfox.exam.spring.repository.QuestionRepository;
import com.greenfox.exam.spring.repository.QuestionsRepository;
import com.greenfox.exam.spring.service.ChooseRandomFive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestQuizController {


  @Autowired
  QuestionRepository questionRepository;

  @Autowired
  QuestionsRepository questionsRepository;

  @Autowired
  AnswerRepository answerRepository;

  @GetMapping("/questions")
  public Questions askQuestions() {
    List allQuestions = (List)questionRepository.findAll();
    return new Questions(ChooseRandomFive.chooseQuestions(allQuestions));
  }

  @PostMapping ("/answers")
  public String giveAnswer(@RequestBody Answers answers){

    return "";
  }

}



