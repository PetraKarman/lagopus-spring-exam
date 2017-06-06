package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Answers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnswersRepository extends CrudRepository<Answers, Long> {
}
