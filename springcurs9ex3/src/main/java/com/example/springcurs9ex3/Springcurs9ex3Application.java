package com.example.springcurs9ex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class Springcurs9ex3Application {

	@GetMapping("/hello")
	public Map<String, Object> hello(@AuthenticationPrincipal Jwt jwt) {
		return jwt.getClaims();
	}

	public static void main(String[] args) {
		SpringApplication.run(Springcurs9ex3Application.class, args);
	}

}

