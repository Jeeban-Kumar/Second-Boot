package com.dash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		System.out.println("Hi this is important");
		int x = 10;
		int y = 30;
		int z = 100;

	}

}
