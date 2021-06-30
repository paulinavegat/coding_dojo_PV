package com.paulina.CodingController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class DojoController {
	
		@RequestMapping("/{palabra}")
		public String showPalabra(@PathVariable("palabra") String palabra) {
			if("palabra".equals(palabra)) {
			return "El " + palabra + " es increible";
		}else if("burbank-dojo".equals(palabra)) {
			return "El Dojo Burbank está localizado al sur de California";	
		}
		else if("san-jose".equals(palabra))	{
			return "El Dojo SJ es el cuartel general";
		}
		else {	
			return "Dojo no está en " + palabra;
			
		}
	}
}
