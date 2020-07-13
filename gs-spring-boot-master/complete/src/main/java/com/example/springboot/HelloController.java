package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/greet")
	public String index() {
		return "Greetings from Spring Boot! \n this is a test!";
	}

	@RequestMapping("/tester")
	public String test() {
		return "test";
	}

	// the above works
	
	 @RequestMapping("/")
	    public String home(Map<String, Object> model) {
	        model.put("message", "HowToDoInJava Reader !!");
	        
	        return "index";
	    }
	 
	@RequestMapping("/next")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "next";
	}

}
