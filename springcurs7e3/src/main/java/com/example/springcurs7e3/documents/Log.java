package com.example.springcurs7e3.documents;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Log {

    @Id
    private String id;

    private String message;

    public Log() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
