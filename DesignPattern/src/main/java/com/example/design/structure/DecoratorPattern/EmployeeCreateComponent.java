package com.example.design.structure.DecoratorPattern;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;
@Slf4j
public class EmployeeCreateComponent implements EmployeeComponent{
    private String name;

    public  EmployeeCreateComponent(String name){
        this.name = name;

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doTask() {
        System.out.println("your task is 2278");
//        log.info("your task is 2278");
    }

    @Override
    public void join(Date joinDate) {
//        log.info(this.getName() +"date join on " +formatDate(joinDate) );
        System.out.println(this.getName() +"date join on " +formatDate(joinDate));
    }
    @Override
    public void terminate(Date terminateDate) {
//        log.info(this.getName() +"date terminate on " +formatDate(terminateDate) );
        System.out.println(this.getName() +"date terminate on " +formatDate(terminateDate));
    }
}
