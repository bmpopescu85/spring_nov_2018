package com.example.curs7ex3.controllers;

import com.example.curs7ex3.documents.Log;
import com.example.curs7ex3.repository.LogRepository;
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
