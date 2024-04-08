package com.example.sathishCode.postOffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PostOfficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostOfficeApplication.class, args);
	}

	 @Bean
	 public RestTemplate restTemplate()
	 {
		 return new RestTemplate();
	 }
}




//http://localhost:8083/postal/byCity?city=Bangalore
// In the key you can give it as city in the postman
//In the value whatever city name you want you can provide it like mumbai, delhi, bangalore hyderabad etc....