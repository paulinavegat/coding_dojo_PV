package com.paulina.elcodigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class CodeController {
	
	@RequestMapping("/")
	public String index () {
		return "index.jsp";
	}
	
	@RequestMapping (value="/randomCode", method=RequestMethod.POST)
	public String randomCode(@RequestParam(value="randomCode")String randomCode, 
			RedirectAttributes redirectAttributes) {
		if(randomCode.equals("bushido")) {
			return "redirect:/code";
		}else {
			redirectAttributes.addFlashAttribute("error", "Entrena Más Duro");
			return "redirect:/";
			
		}
	}
	//toma el codigo ingresado y lo compara con el codigo bushido, si es exitoso devuelve a pagina del codigo sino entrega un error
	
	@RequestMapping("/code")
	public String randomCode() {
		return "code.jsp";
	}
	
	//mostraria la pagina con los valores del codigo si es que acierta correctamente
}

