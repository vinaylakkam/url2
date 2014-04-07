package com.vspace.url2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping
	public String home() {
		return "home";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String shortIt(@RequestParam String url1, Model model) {
		
		model.addAttribute("url1", url1);
		model.addAttribute("url2", "url2");
		
		return "shortIt";
	}
}