package com.example.springcurs9ex1.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasAnyRole('ADMIN')")
    //@Secured("ADMIN")
    public String hello(Principal principal) {
        return "Hello " + principal.getName();
    }

    @GetMapping("/name")
    @PostAuthorize("#principal.name == john")
    public String name(Principal principal) {
        return "john";
    }
}
