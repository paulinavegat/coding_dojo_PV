package com.paulina.com.ninjagoldgame;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
    ArrayList<String> activity  = new ArrayList<String>();
    Integer totalGold = 0;
    Integer random;
    
    @RequestMapping("/")
    public String index (HttpSession session) {
	session.setAttribute("count", totalGold);
	session.setAttribute("actions", activity);
	return "Gold.jsp";
    }

    
    @RequestMapping("/clear")
    public String clear (HttpSession session) {
	return "redirect:/";
    }
    
    @RequestMapping("/making_money")
    public String processMoney(@RequestParam(value="forms") String location) {
	Date format = new Date ();
	if (location.equals("farm")) {
	    random=(int) (Math.random()*11)+10;
	    totalGold+= random;
	    activity.add("You entered the " + location + " and earned " + random + " gold ( "+ format + " )");
	}
	    
	if (location.equals("cave")) {
	 random=(int)(Math.random()*6)+5;
	 totalGold+= random;
	 activity.add("You entered the " + location + " and earned " + random + " gold ( " + format + " )");
	}
	
	if (location.equals("house")) {
	    random=(int)(Math.random()*4)+2;
	    totalGold+= random;
            activity.add("You entered the " + location + " and earned " + random + " gold ( " + format + " )");
	}
	
	if (location.equals("casino")) {
	    int random=(int)(Math.random()*101)+(-50);//suma o reste
	    if(random<0) {
		activity.add("You entered the " + location + " and lost " + random + " gold ( " + format + " )");
		// System.out.println("negative");
	    } 
	   
	    else {
		activity.add("You entered the " + location + " and earned " + random + " gold ( " + format + " )");
		}  
	    totalGold+= random;
	}
	return "redirect:/";
    }  
    
}
