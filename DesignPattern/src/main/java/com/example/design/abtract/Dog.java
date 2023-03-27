package com.example.design.abtract;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends animal{
    @Override
    public void makeSound() {
        log.info("gâu gâu");
    }
}
