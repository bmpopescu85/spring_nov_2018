package com.endava.curs5ex1.services;

import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;

@Service
public class TestService {

    @PostConstruct
    public void init() {
        System.out.println("############ Initializing test service ... ############");
    }
}
