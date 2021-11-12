package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ZenkiHuku2Controller {
	
	@RequestMapping(path = "/zenkihukuInput", method = RequestMethod.GET)
	public String view() {
		
		return "/zenki2";
	}
	
	@RequestMapping(path = "/zenkihukuInput", method = RequestMethod.POST)
	public String view2(String hukuInput) {
		System.out.println(hukuInput);
		return "/zenki2";
	}
	
}