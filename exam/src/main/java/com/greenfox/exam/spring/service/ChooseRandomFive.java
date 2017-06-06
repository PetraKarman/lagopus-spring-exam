package com.greenfox.exam.spring.service;

import com.greenfox.exam.spring.model.Question;

import java.util.ArrayList;
import java.util.List;

public class ChooseRandomFive {
  public static ArrayList<Question> chooseQuestions(List<Question> allQuestions) {
    ArrayList<Question> randomQuestions = new ArrayList<>();
    while (randomQuestions.size() < 5) {
      Question question = allQuestions.get((int) (Math.random() * allQuestions.size()));
      if (!randomQuestions.contains(question)) {
        randomQuestions.add(question);
      }
    }
    return randomQuestions;
  }
}



