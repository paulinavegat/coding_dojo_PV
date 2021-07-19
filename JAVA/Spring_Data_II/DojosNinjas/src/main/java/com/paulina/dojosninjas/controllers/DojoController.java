package com.paulina.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulina.dojosninjas.models.Dojo;
import com.paulina.dojosninjas.models.Ninja;
import com.paulina.dojosninjas.services.DojoService;


@Controller
public class DojoController {
	
	private final DojoService dojoService;

	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@RequestMapping ("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojos/newDojo.jsp";
	}
	
	@PostMapping ("/dojos/new")
	public String createDojo(@Valid @ModelAttribute ("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojos/newDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/" + Long.toString(dojo.getId());
		}
	}
	

	@RequestMapping ("/dojos/{id}")
	public String display (@PathVariable ("id") Long id, Model model) {
		List<Ninja> ninjas = dojoService.findDojo(id).getNinjas();
		model.addAttribute("dojo", dojoService.findDojo(id));
		model.addAttribute("ninjas", ninjas);
		return "dojos/DojoPage.jsp";
				
	}
}