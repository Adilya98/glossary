package com.example.models;

public class GlossaryModel {

    private final String name;

    private final String description;

    public GlossaryModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
