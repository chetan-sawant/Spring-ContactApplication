package com.spcontact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("test/hello")
	public String helloPrint() {
		System.out.println("TestController.helloPrint()");
		return "hello";
	}
	
}
