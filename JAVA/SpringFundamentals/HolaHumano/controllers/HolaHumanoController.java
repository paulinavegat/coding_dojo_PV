package com.paulina.holahumano.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaHumanoController {
	
	@RequestMapping ("/")
	public String Human(@RequestParam(value="name", defaultValue="Human") String searchQuery) {

			return "Hello " + searchQuery + " Welcome to SpringBoot!";
		}
	}
