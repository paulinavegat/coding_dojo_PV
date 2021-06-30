package com.paulina.holahumano.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaHumanoController {
	
	@RequestMapping ("/")
	public String Human(@RequestParam(value="name", defaultValue="Human") String searchQuery) {
		if (searchQuery.equals(null)) {
			return "Hello " + " Welcome to SpringBoot!";
		}
		else {
			return "Hello " + searchQuery + " Welcome to SpringBoot!";
		}
	}
}
