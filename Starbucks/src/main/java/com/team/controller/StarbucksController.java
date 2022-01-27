package com.team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/")
public class StarbucksController {
	
	@GetMapping("main")
	public String main() {
		System.out.println("main 실행");
		return "main";			
	}

	@GetMapping("info")
	public String info() {
		System.out.println("info 실행");
		return "info";
	}
			
	@GetMapping("menu")
	public String menu() {
		System.out.println("menu 실행");
		return "menu";
	}
	
}
