package com.example.springcurs10ex1.controller;

import com.example.springcurs10ex1.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @PostConstruct
    public void init() {
        System.out.println("IndexService: " + indexService.getClass());
    }

    @GetMapping("/")
    public String index(Map<String, String> body) {
        body.put("name", indexService.getName());
        return "index.html";
    }
}
