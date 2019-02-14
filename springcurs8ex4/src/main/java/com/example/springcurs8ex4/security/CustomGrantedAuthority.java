package com.example.springcurs8ex4.security;

import org.springframework.security.core.GrantedAuthority;

public class CustomGrantedAuthority implements GrantedAuthority {

    @Override
    public String getAuthority() {
        return "ADMIN";
    }
}
