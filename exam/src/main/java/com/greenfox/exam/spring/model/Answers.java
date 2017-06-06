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
public class Answers {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  @Column(columnDefinition = "LONGBLOB")
  ArrayList<Answer> answers;

  public Answers(){
  }

  public Answers(ArrayList<Answer> answers) {
    this.answers = answers;
  }

}
