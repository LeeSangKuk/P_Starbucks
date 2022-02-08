package com.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleController {
	@GetMapping("main")
	public void main() {
		System.out.println("main 실행");
		
	}
	
	@PostMapping("main")
	public void postMain() {
		System.out.println("main 실행");
		
	}

	@GetMapping("info")
	public void info() {
		System.out.println("info 실행");
	}
			
	@GetMapping("menu")
	public void menu() {
		System.out.println("menu 실행");
	}
	
}
