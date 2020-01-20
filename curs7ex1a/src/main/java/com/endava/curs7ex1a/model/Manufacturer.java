package com.endava.curs7ex1a.model;

import org.springframework.data.annotation.Id;

import java.util.UUID;

public class Manufacturer {

    @Id
    private String id;

    private String name;

    public Manufacturer() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
