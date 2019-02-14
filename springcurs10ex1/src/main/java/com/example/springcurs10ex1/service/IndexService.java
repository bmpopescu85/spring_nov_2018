package com.example.springcurs10ex1.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.SecureRandom;

@Service
@Scope(scopeName = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class IndexService {

    private String number;

    @PostConstruct
    public void init() {
        try {
            number = String.valueOf(SecureRandom.getInstanceStrong().nextInt());
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return this.number;
    }
}
