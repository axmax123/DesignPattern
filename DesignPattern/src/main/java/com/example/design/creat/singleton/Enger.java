package com.example.design.creat.singleton;

public class Enger {
    public static final Enger INSTANCE = new Enger();
    private Enger(){
    }
    public static Enger getInstance(){
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
