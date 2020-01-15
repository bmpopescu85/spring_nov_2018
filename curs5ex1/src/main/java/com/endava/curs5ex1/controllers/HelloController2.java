package com.endava.curs5ex1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {

    @RequestMapping(method = RequestMethod.GET, path = "/sayhello2")
    public String hello() {
        return "hello.html";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sayhi2")
    public String hi() {
//        return "<h1>Hi there!</h1>";
        return "hello.html";
    }
}
