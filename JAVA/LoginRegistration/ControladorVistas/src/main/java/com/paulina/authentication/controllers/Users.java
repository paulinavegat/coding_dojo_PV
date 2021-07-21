package com.paulina.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.paulina.authentication.models.User;
import com.paulina.authentication.services.UserService;
import com.paulina.authentication.validator.UserValidator;

@Controller
public class Users {
    private final UserService userService;
     private final UserValidator userValidator;
    
      public Users(UserService userService, UserValidator userValidator) {
        this.userService = userService;
        this.userValidator = userValidator;
    }    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "registrationPage.jsp";
        }
        User user2 = userService.registerUser(user);
        session.setAttribute("userId", user2.getId());
        return "redirect:/home";
    }
    //si el resultado tiene errores, retornar a la página de registro (no se preocupe por las validaciones por ahora)
    //si no, guarde el usuario en la base de datos, guarde el id del usuario en el objeto Session y redirija a /home
    
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password")  String password, Model model, HttpSession session) {
	    if (userService.authenticateUser(email, password)) {
	    	User user2= userService.findByEmail(email);
	    	session.setAttribute("userId", user2.getId());
	    	return "redirect:/home";
	    }else {
	    	model.addAttribute("error", "Invalid Credentials. Please try again");
	    	return "loginPage.jsp";
	    }
	}
    //Si el usuario está autenticado, guarde su id de usuario en el objeto Session
    //sino agregue un mensaje de error y retorne a la página de inicio de sesión.
    
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
    	Long userId=(Long) session.getAttribute("userId");
    	User user2=userService.findUserById(userId);
    	model.addAttribute("user",user2);
    	return "homePage.jsp";
        //Obtener el usuario desde session, guardarlo en el modelo y retornar a la página principal
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/login";
        // invalidar la sesión
        // redireccionar a la página de inicio de sesión.
    }
}