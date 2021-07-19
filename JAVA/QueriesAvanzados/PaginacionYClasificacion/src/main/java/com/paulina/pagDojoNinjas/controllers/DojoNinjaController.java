package com.paulina.pagDojoNinjas.controllers;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulina.pagDojoNinjas.models.Ninja;
import com.paulina.pagDojoNinjas.services.DojoNinjasService;


@Controller
public class DojoNinjaController {
	private final DojoNinjasService dojoNinjasService;
	
	public DojoNinjaController(DojoNinjasService dojoNinjasService) {
        this.dojoNinjasService = dojoNinjasService;
    }
	
	@RequestMapping("/")
	public String home(Model model) {
		List<Object[]> table = dojoNinjasService.dojoNinjas();
		model.addAttribute("table", table);
		return "index.jsp";
	}
	
	@RequestMapping("/ninjas/{pageNumber}")
	public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
	    Page<Ninja> ninjas = dojoNinjasService.ninjasPerPage(pageNumber - 1);
	    int totalPages = ninjas.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("ninjas", ninjas);
	    return "/ninjas/ninjas.jsp";
	}
	
	@RequestMapping("/dojos/{number}")
	public String getDojosPerPage(Model model, @PathVariable("number") int number) {
	    Page<Object[]> dojos = dojoNinjasService.sortedDojos(number - 1);
	    int totalPages = dojos.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("dojos", dojos);
	    return "dojos/DojoPage.jsp";
	}
}