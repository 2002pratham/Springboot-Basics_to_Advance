package com.igreaper.learning.Introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringbootApplication.class, args);
        System.out.println("Please lookout in branches for each topics individually");
	}
}
