package com.greenfox.exam.spring;

import com.greenfox.exam.spring.model.Question;
import com.greenfox.exam.spring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner{

	@Autowired
	QuestionRepository questionRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
	questionRepository.save(new Question(1,"When did your course start?","2017.03.13"));
		questionRepository.save(new Question(2,"What type of dog Barbi has?","Whippet"));
		questionRepository.save(new Question(3,"What is HerrNorbert's favourite color?","Green"));
		questionRepository.save(new Question(4,"How many classes are learning at Green Fox Academy at this moment?","4"));
		questionRepository.save(new Question(5,"What was the name of the first Green Fox class?","Vulpes"));
		questionRepository.save(new Question(6,"How many likes do we have on facebook?","~3300"));
		questionRepository.save(new Question(7,"What is Tojas's horoscope?","Libra"));
	}
}
