package com.exam.dock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockApplication {
	@GetMapping("/")
	public String anusha() {
	   return "hope you are enjoying the seeion";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockApplication.class, args);
	}

}
