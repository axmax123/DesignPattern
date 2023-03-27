package com.example.design.creat.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EngerMain {
    public static void main(String[] args){
        Enger enger = Enger.getInstance();
        enger.setName("enger");
        log.info(enger.getName());

        Lazy lazy = Lazy.getInstance();
        lazy.setName("lazy");
        log.info(lazy.getName());

        ThreadSafe threadSafe = ThreadSafe.getInstance();
        threadSafe.setName("threadsafe");
        log.info(threadSafe.getName());


        DoubleCheck doubleCheck = DoubleCheck.getInstance();
        doubleCheck.setName("doublecheck");
        log.info(doubleCheck.getName());





    }
}
