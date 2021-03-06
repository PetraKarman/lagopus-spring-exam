package com.greenfox.exam.spring.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "questions")
@AllArgsConstructor
@Getter
@Setter
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String question;

  public Question() {
  }

  public Question(String question) {
    this.question = question;
  }
}
