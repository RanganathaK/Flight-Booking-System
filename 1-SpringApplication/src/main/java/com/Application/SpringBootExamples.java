package com.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.Application.Entity")
public class SpringBootExamples {
	
	public static void main(String args[]) {
		SpringApplication.run(SpringBootExamples.class,args);
	}

}
