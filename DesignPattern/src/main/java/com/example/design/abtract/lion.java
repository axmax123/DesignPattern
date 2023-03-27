package com.example.design.abtract;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class lion extends animal{
    @Override
    public void makeSound() {
        log.info("gawwww");
    }
}
