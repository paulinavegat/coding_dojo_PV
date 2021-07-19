package com.paulina.dojoOverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.dojoOverflow.models.Question;
import com.paulina.dojoOverflow.repositories.QuestionRepository;


@Service
public class QuestionService {
	private final QuestionRepository questionRepository;

	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<Question> findAll() {
		return questionRepository.findAll();
	}
	public Question createQuestion(Question question) {
		return questionRepository.save(question);
	}
	
	public void updateQuestion(Question question) {
		questionRepository.save(question);
	}
	public Question findQuestion(Long id) {
		Optional<Question> optionalQuestion = questionRepository.findById(id);
		if(optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		}
		else {
			return null;
		}
	}

	public void deleteQuestion (Long id) {
		questionRepository.deleteById(id);
	}
	
}
