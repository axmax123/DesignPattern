package com.example.design.structure.DecoratorPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeamLead extends EmployeeDecorator{
    protected TeamLead(EmployeeComponent employee) {
        super(employee);
    }

    public void planing(){
//        log.info(this.employeeComponent.getName() +" is planing.");
        System.out.println(this.employeeComponent.getName() +" is planing.");

    }
    public void motivate(){
//        log.info(this.employeeComponent.getName() +"is motivating his members.");
        System.out.println(this.employeeComponent.getName() +"is motivating his members.");

    }
    public void monitor(){
//        log.info(this.employeeComponent.getName() +"  is monitoring his members.");
        System.out.println(this.employeeComponent.getName() +"  is monitoring his members.");

    }
    @Override
    public void doTask() {
        employeeComponent.doTask();
        planing();
        motivate();
        monitor();
    }
}
