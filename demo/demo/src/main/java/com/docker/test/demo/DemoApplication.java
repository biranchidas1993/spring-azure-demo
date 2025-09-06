package com.docker.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DemoApplication {
	
	@GetMapping("/message")
public String getMessage() {
	return "Hello biranchi";
	
}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.print("check biranchi");
	}

}
