package com.rakutech.Rakutech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/welcom")
	public String welcome() {
		return "Welcome";
	}
	
	@GetMapping("/")
	public String Home() {
		return "Home Page";
	}

}
