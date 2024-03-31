package com.example.LoadBalacing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;





@RestController
@RibbonClient(name = "micro1")
public class CallingC {
	
	@Autowired
	private RestTemplate templete;
	
	
	 @GetMapping("/hello")
	 public String hello() {
         String response = templete.getForObject("http://micro1/port", String.class);
         return "Response from server: " + response;
     }
	

}
