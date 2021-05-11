package com.example.htmlfy.models;

public class Attribute {
    private String type;
    private String value;

    public Attribute(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Attribute(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
