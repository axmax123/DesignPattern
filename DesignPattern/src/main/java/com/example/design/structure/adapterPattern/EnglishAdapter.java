package com.example.design.structure.adapterPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnglishAdapter {
    public void receive(String words) {
        log.info("Retrieving words from Adapter ...");
        log.info(words);
//        System.out.println("Retrieving words from Adapter ...");
//        System.out.println(words);
    }
}
