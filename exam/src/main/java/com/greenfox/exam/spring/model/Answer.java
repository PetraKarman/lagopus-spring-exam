package com.greenfox.exam.spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;

@AllArgsConstructor
@Entity
@Getter
@Setter
public class Answer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String answer;

  public Answer() {
  }

  public Answer(String answer) {
    this.answer = answer;
  }
}
