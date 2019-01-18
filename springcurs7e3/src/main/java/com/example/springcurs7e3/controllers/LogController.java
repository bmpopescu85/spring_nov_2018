package com.example.springcurs7e3.controllers;

import com.example.springcurs7e3.documents.Log;
import com.example.springcurs7e3.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    private LogRepository logRepository;

    @PostMapping("/add/log")
    public void addLog(@RequestBody Log log) {
        logRepository.save(log);
    }
}
