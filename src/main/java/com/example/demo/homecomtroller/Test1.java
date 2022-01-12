package com.example.demo.homecomtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Test1 {

	@RequestMapping("/home")
	private String name() {
	//	System.out.println("hello");
		
		String s="hungry";
		if ( s=="hungry")
		{
			System.out.println("i am hungry");
			return "hello";
		}
		else
		{
			System.out.println("do work");
			return "do work";
		}
		

	}
	
}
