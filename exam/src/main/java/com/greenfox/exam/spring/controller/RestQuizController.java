package com.greenfox.exam.spring.controller;


import com.greenfox.exam.spring.model.*;
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

  ArrayList<Question> questions;


  @GetMapping("/questions")
  public Questions askQuestions() {
    List allQuestions = (List) questionRepository.findAll();
    return new Questions(ChooseRandomFive.chooseQuestions(allQuestions));
  }

  @PostMapping("/answers")
  public ProjectList giveAnswers(@RequestBody Answers givenAnswers) {
    ArrayList<Answer> answers = givenAnswers.getAnswers();
    boolean isCorrect = true;
    for (Answer answer : answers) {
      if (answer.getId() != questions.get(answers.indexOf(answer)).getId() || answer.getAnswer().equals
              (answerRepository.findOne(answer.getId()).getAnswer())) {
        isCorrect = false;
      }
    }
    if (isCorrect) {
      return new ProjectList();
    }
    return null;
  }
}

