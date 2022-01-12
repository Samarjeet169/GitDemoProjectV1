package com.example.demo.homecomtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/update")
public class Test2 {

	@RequestMapping("/update1")
	private String name() {
	//	System.out.println("hello");
		
		String s="hungryupdate";
		if ( s=="hungryupdate")
		{
			System.out.println("i am hungryupdate");
			return "hello";
		}
		else
		{
			System.out.println("do work");
			return "do work";
		}
		

	}
	
}
