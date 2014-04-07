package com.vspace.url2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vspace.url2.service.ShortenerService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	ShortenerService shortenerService;
	
	@RequestMapping
	public String home() {
		return "home";
	}
	
	@RequestMapping("/{url2}")
	public String hitUrl2(@PathVariable String url2) {
		
		return "redirect:" + "http://www.google.com";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String shortIt(@RequestParam String url1, Model model) {
		
		String url2 = shortenerService.shortIt(999);
		
		model.addAttribute("url1", url1);
		model.addAttribute("url2", url2);
		
		return "shortIt";
	}
}