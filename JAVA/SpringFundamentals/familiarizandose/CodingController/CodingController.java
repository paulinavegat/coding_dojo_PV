package com.paulina.CodingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class CodingController {
	   @RequestMapping("/coding")
		public String hola() {
			return "Hola Coding Dojo";
		}
		@RequestMapping("/python")
		public String python () {
			return "Python/Django fue increíble!";			
		}
		
		@RequestMapping("/java")
		public String java () {
			return "¡Java/Spring es mejor!";
		}
		
}
