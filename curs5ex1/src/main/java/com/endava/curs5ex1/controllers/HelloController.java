package com.endava.curs5ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/sayhello")
    public String hello() {
        return "hello.html";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sayhi")
    @ResponseBody
    public String hi() {
//        return "<h1>Hi there!</h1>";
        return "hello.html";
    }

}
