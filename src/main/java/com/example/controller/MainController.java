package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String test(Model model) {
		model.addAttribute("msg", "Xin chao the gioi - Hello World");
		return "test";
	}
}
