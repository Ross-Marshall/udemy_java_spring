package com.caveorprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OffersController {
	
	@RequestMapping("/")
	public @ResponseBody String showHome() {
		return "home";
	}

}
