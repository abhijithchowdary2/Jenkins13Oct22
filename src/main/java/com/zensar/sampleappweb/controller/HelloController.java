package com.zensar.sampleappweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Welcome to Jenkins :)</h1>";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "<h1>Welcome to Jenkins :)</h1>";
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "<h1>Good Bye everyone....</h1>";
	}
	
	@RequestMapping("/greet")
	public String sayGreet() {
		return "<h1>Good Morning Everyone from Abhijith Chowdary :)</h1>";
	}
}
