package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);


     // fixing bug-121
	 public String greet(){

            return "Good Morning";

	 }



	}










	// fixing bug 122

	public String welocme(){

		return "Welcome to JRTP";
	}


}
