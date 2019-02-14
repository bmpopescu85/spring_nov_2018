package com.example.springcurs9ex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class Springcurs9ex2Application {

	@GetMapping("/details")
	public Map<String, Object> details(OAuth2AuthenticationToken token) {
		return token.getPrincipal().getAttributes();
	}

	public static void main(String[] args) {
		SpringApplication.run(Springcurs9ex2Application.class, args);
	}

}

