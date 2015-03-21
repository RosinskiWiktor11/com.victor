package com.victor.controller;

import org.springframework.stereotype.Component;
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

	@RequestMapping(value="/hello.html")
	public String index(){
		System.out.println("test");
		return "WEB-INF/jsp/index.jsp";
	}
	
}
