package com.paulina.dojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.paulina.dojoOverflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long> {
	List <Answer> findAll();

}
