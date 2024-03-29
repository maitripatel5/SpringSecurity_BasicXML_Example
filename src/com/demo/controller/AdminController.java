package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public ModelAndView visitAnother() {
		return new ModelAndView("welcome");
	}
		
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public ModelAndView visitAdmin() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Admministrator Control Panel");
		model.addObject("message", "This page demonstrates how to use Spring security.");
		
		return model;
	}
}
