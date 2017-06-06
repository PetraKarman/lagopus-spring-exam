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
  public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column (columnDefinition = "LONGBLOB")
    ArrayList<Question> questions;

    public Questions(){
    }

  public Questions(ArrayList<Question> questions) {
    this.questions = questions;
  }

}
