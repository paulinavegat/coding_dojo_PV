package com.paulina.dojoOverflow.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.paulina.dojoOverflow.models.Answer;
import com.paulina.dojoOverflow.repositories.AnswerRepository;


@Service
public class AnswerService {
	
	private final AnswerRepository answerRepository;

	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	public List<Answer> allAnswer() {
		return answerRepository.findAll();
	}
	public void createAnswer(Answer answer) {
		answerRepository.save(answer);
	}
	
	public void updateAnswer(Answer answer) {
		answerRepository.save(answer);
	}
	public Answer findAnswer(Long id) {
		Optional<Answer> optionalAnswer = answerRepository.findById(id);
		if(optionalAnswer.isPresent()) {
			return optionalAnswer.get();
		}
		else {
			return null;
		}
	}

	public void deleteAnswer (Long id) {
		answerRepository.deleteById(id);
	}
	
}



