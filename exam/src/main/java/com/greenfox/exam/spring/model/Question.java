package com.greenfox.exam.spring.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "questions")
@AllArgsConstructor
@Getter
@Setter
public class Question {

  @Id
  long id;
  String question;
  String answer;

  public Question(){

  }
}
