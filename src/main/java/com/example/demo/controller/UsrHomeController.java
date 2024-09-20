package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UsrHomeController {
	
	int a = 0;
	
	@GetMapping("/usr/home/count")
	@ResponseBody
	public int showMain3() {
		return a++;
	}
	
}
