package com.paulina.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paulina.languages.models.Language;
import com.paulina.languages.services.LangService;


@Controller
public class LangController {
	private final LangService langService;
	
	public LangController(LangService langService) {
		this.langService = langService;
	}
	
	@RequestMapping("/")
    	public String index() {
    		return "/index.jsp";
    	}
	
	@RequestMapping("/languages")
	public String index(Model model) {
		List<Language> langs = langService.allLangs();
		model.addAttribute(new Language());
		model.addAttribute("langs", langs);
		return "index.jsp";
	}
	@RequestMapping(value="/languages",method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			
			return "index.jsp";
		} else {
			langService.createLang(language);
			return "redirect:/languages";
		}
	}
	@RequestMapping(value="/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLang(id);
		model.addAttribute("lang", lang);
		return "show.jsp";
	}
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language lang = langService.findLang(id);
		model.addAttribute("lang", lang);
		return "edit.jsp";
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("lang") Language language, BindingResult result,@PathVariable("id")Long id) {
	    if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			langService.updateLang(language);
			return "redirect:/languages";
		}
	}
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		langService.deleteLang(id);
		return "redirect:/languages";
	}

	
}