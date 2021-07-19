package com.paulina.dojosninjas.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulina.dojosninjas.models.Dojo;
import com.paulina.dojosninjas.models.Ninja;
import com.paulina.dojosninjas.services.NinjaService;
import com.paulina.dojosninjas.services.DojoService;

@Controller
public class NinjaController {

	@Autowired
	private final DojoService dojoService;
	
	private final NinjaService ninjaService;
	
	public NinjaController(NinjaService ninjaService) {
		this.dojoService = null;
		this.ninjaService = ninjaService;
	}

	@RequestMapping ("/ninjas/new")
	public String newNinja (@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
			return "ninjas/newNinja.jsp";
		}

	@PostMapping ("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute ("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninjas/newNinja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
}
