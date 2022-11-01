package com.example.demo.crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class BankController {

	
	@GetMapping("/getbank")
	public Bank getBank() {
	
		
		return null;
	}
	
}
