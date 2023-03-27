package com.example.design.filter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Target {
    public void execute(HttpRequest httpRequest){
        log.info("Executing request: " + httpRequest);

    }
}
