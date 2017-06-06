package com.greenfox.exam.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Entity
@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String question;
  String answer;

  public Answer() {
  }

  public Answer(String answer) {
    this.answer = answer;
  }
}
