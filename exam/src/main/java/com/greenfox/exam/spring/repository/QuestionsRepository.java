package com.greenfox.exam.spring.repository;

import com.greenfox.exam.spring.model.Questions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsRepository extends CrudRepository<Questions, Long> {
}
