package com.paulina.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paulina.relationships.models.License;
import com.paulina.relationships.models.Person;
import com.paulina.relationships.services.LicenseService;
import com.paulina.relationships.services.PersonService;

@Controller
public class RelationshipController {
     private final PersonService personService;
     private final LicenseService licenseService;
          
     public RelationshipController(PersonService personService, LicenseService licenseService) {
	
	this.personService = personService;
	this.licenseService = licenseService; 
	
    }

    @RequestMapping("persons/new")
    public String newPerson(@ModelAttribute("person")Person person) {
	return "/driver/newPerson.jsp";
    }
    
     //@RequestMapping(value="/persons", method=RequestMethod.POST)
    @PostMapping("/persons")
    public String createPerson(@Valid @ModelAttribute ("person")Person person, BindingResult result) {
     if(result.hasErrors()) {
		return "/driver/newPerson.jsp";
	}else {
	    personService.createPerson(person);
	    return "redirect:/persons/new";
	}   
    }
    
    @RequestMapping("/licenses/new")
    public String newLicense(@ModelAttribute ("license") License license, Model model) {
	List<Person> person= personService.findAllPersons();
	model.addAttribute("person",person);
	return "/driver/newLicense.jsp";
     }
    
    @PostMapping("/licenses/new")
    public String newLicense(@Valid @ModelAttribute ("license") License license, BindingResult result) {
	 System.out.println(license.getExpirationDate());
    	if (result.hasErrors()) {
		   return "/driver/newLicense.jsp";
           }else {
		    licenseService.createLicense(license);
		    return "redirect:/persons/" + license.getPerson().getId();
	   }  
	}
    
    
    @RequestMapping("/persons/{id}")
    public String personPage(@PathVariable ("id") Long id, Model model) {
	Person person = personService.findPersonById(id);
	License license = person.getLicense();
	model.addAttribute("person", person);
	model.addAttribute("license", license);
	return "/driver/person.jsp";
	
    }
    
    
}
     


