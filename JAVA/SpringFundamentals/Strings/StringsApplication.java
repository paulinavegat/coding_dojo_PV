package com.paulina.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello client! How are you doing?";
	}
	// Cuando el usuario visite la ruta raíz "/", haga que aparezca un buen mensaje para el cliente.
	
	@RequestMapping("/random")
	public String random() {
		return "Wow! I just used request mapping to do this very basic thing!";
	}
	//Cuando el usuario visite la ruta "/random", haga que aparezca un buen mensaje acerca de Spring Boot al cliente.

}
