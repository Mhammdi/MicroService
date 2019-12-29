package com.vision.riad.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
	
	
	@RequestMapping("hello")
	public String hello() {
		System.out.println("l");
		return "hello";
	}
}
