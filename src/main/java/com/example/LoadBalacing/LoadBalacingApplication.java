package com.example.LoadBalacing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@RestController
public class LoadBalacingApplication {
	
	
	 	
	 	
	public static void main(String[] args) {
		SpringApplication.run(LoadBalacingApplication.class, args);
	}

}
