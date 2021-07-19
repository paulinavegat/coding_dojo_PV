package com.paulina.dojoOverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.paulina.dojoOverflow.models.Answer;
import com.paulina.dojoOverflow.models.Question;
import com.paulina.dojoOverflow.services.AnswerService;
import com.paulina.dojoOverflow.services.QuestionService;

@Controller
public class AnswerController {
	private final AnswerService answerService;
	private final QuestionService questionService;
	
		public AnswerController(AnswerService answerService, QuestionService questionService) {
	
		this.answerService = answerService;
		this.questionService = questionService;
	}


	@PostMapping("/questions")
	public String addAnswer(@Valid @ModelAttribute("ans") Answer answer, @RequestParam("question") Long id, BindingResult result, RedirectAttributes flash) {
		if (answer.getAnswer().length() < 3) {
			flash.addFlashAttribute("errors", "Answer must be at least 3 characters long.");
		}
		
		if (flash.getFlashAttributes().size()>0) {
			return "redirect:/questions/"+id;
		
		} else {
			answerService.createAnswer(answer);
			Long myID = answer.getQuestion().getId();
			return "redirect:/questions/"+myID;
		}
	}
	
	@RequestMapping("/questions/{id}")
	public String showAnswer(@ModelAttribute("ans") Answer answer, @PathVariable("id") Long id, Model model) {
		Question theQuestion = questionService.findQuestion(id);
		model.addAttribute("thequestion", theQuestion);
		model.addAttribute("tags", theQuestion.getTags());
		model.addAttribute("answers", theQuestion.getAnswers());
		return "answers/questionProfile.jsp";
	}
	
}