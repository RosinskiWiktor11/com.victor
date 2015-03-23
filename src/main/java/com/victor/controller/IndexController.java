package com.victor.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	public IndexController() {
		System.out.println("***********************************");
		System.out.println("******      CONTROLLER      *******");
		System.out.println("***********************************");
	}

	@RequestMapping(value="/index")
	public String index(){
		System.out.println("test");
		return "index";
	}
	@RequestMapping(value="/test.html", method=RequestMethod.GET)
	public String test(){
		System.out.println("test");
		return "hello";
	}
	
}
