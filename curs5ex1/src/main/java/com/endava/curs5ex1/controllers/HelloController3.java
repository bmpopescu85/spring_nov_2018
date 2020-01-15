package com.endava.curs5ex1.controllers;

import com.endava.curs5ex1.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController3 {

    @Autowired
    public RestTemplate restTemplate;

    @Value("${world.url}")
    private String worldUrl;

    @GetMapping("/sayhello3")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/sayhi3")
    public String hi() {
        return "<h1>Hi there, 3!</h1>";
    }

    @GetMapping("/sayhello3nocontent")
    public String hello2(HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return "hello.html";
    }

    @GetMapping("/sayhello3/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello, " + name;
    }

    // test with 'http://localhost:8082/sayworld?name=John'
    @PostMapping("/sayworld")
    public String sayHello2(@RequestParam("name") String name) {
        return "Hello, " + name;
    }

    // test with a simple text as request Body
    @PostMapping("/testbody")
    public String testBody(@RequestBody String test) {
        return test;
    }

    // test with a simple JSON as request Body, for example
    // request Body: {"name": "Cioco"}
    @PostMapping("/testbody2")
    public String testBody(@RequestBody Product test) {
        return test.getName();
    }

    // test with a simple JSON as request Body and a path variable, for example
    // request Body: {"name": "Cioco"}
    // http://localhost:8082/testbody2/Mocko
    @PostMapping("/testbody2/{msg}")
    public String testBody2(@PathVariable String msg, @RequestBody Product test) {
        System.out.println(">>>>> MSG: " + msg);
        return test.getName();
    }

    // test with 'http://localhost:8082/hello3'
    @GetMapping("/hello3")
    public String hello3() {
        String result = restTemplate.getForObject(worldUrl, String.class);
        return "Result: " + result;
    }
}
