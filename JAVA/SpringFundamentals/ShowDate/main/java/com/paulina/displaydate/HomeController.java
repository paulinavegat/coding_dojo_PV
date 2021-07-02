package com.paulina.displaydate;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")	
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate localDate=LocalDate.of(2021,07,01);
		String dateInSpanish=localDate.format(DateTimeFormatter.ofPattern("EEEE, dd ' de ' MMMM, yyyy"));
        model.addAttribute("date",dateInSpanish);
        return "displaydate.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		LocalTime localTime= LocalTime.now();
		DateTimeFormatter datetimeformatter= DateTimeFormatter.ofPattern("hh:mm a");
		model.addAttribute("time", localTime.format(datetimeformatter));
		return "displaytime.jsp";
	}
	
}
//Date currentDate = new Date();
//model.addAttribute("date",(DateFormat.getDateInstance().format(currentDate)));
	
	
	
	
