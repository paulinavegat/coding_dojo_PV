package com.paulina.dojoOverflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.paulina.dojoOverflow.models.Question;
import com.paulina.dojoOverflow.models.Tag;
import com.paulina.dojoOverflow.services.QuestionService;
import com.paulina.dojoOverflow.services.TagService;

@Controller
public class QuestionController {
	private final QuestionService questionService;
	private final TagService tagService;
	
		public QuestionController(QuestionService questionService, TagService tagService) {
	
		this.questionService = questionService;
		this.tagService = tagService;
	}

	@RequestMapping("/questions")
	public String dashboard (Model model) {
		List <Question> questions = questionService.findAll();
		model.addAttribute("questions", questions);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String newQuestion(@ModelAttribute("addQuestion") Question question) {
		return "questions/newQuestion.jsp";
	}
   
	@PostMapping("/questions/new")
	public String newQuestion(@Valid @ModelAttribute("addQuestion") Question question, BindingResult result, @RequestParam("qTag") String qTag, RedirectAttributes flash) {
		
		int coma = qTag.replaceAll("[^,]", "").length();
		if (coma>2) {
			flash.addFlashAttribute("errors", "You can add 3 tags at the most.");
		}

		if (!qTag.equals(qTag.toLowerCase())) {
			flash.addFlashAttribute("errors", "must be all lower case");
		}

		if (flash.getFlashAttributes().size()>0) {
			return "redirect:/questions/new";
			
		} else if(result.hasErrors()){	
			return "questions/newQuestion.jsp";
		} else {
			
			Question myQ = questionService.createQuestion(question);	
			List<String> items = (List<String>)Arrays.asList(qTag.trim().split("\\s*,\\s*"));

			ArrayList<Tag> tags = new ArrayList<Tag>();
			for(int i=0;i<items.size();i++) {
				tags.add(tagService.createTag(items.get(i)));
			}
			
			myQ.setTags(tags);
			questionService.createQuestion(myQ);
			
			return "redirect:/questions";
		}
	}
}