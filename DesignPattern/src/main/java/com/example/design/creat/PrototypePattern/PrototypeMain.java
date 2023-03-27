package com.example.design.creat.PrototypePattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrototypeMain {
    public static void main(String[] args) {
        User user = new User("drake","12345","1234 hell");
//        User user1 = user;
        User user1 = user.clone();
        log.info(String.valueOf(user));
        log.info(String.valueOf(user1));
       user1.setUserName("jkasdjka");
       log.info(String.valueOf(user1));


    }
}
