package com.example.design.structure.DecoratorPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Manager extends EmployeeDecorator{
    protected Manager(EmployeeComponent employee) {
        super(employee);
    }

    public void creatRequirement(){
//    log.info(this.employeeComponent.getName() +" is create requirements.");
        System.out.println(this.employeeComponent.getName() +" is create requirements.");

    }
    public void assignTask(){
//        log.info(this.employeeComponent.getName() +" assign task.");
        System.out.println(this.employeeComponent.getName() +" assign task.");

    }
    public void managerProcess(){
//        log.info(this.employeeComponent.getName() +" is managing the progress.");
        System.out.println(this.employeeComponent.getName() +" is managing the progress.");

    }
    @Override
    public void doTask() {
        employeeComponent.doTask();
        creatRequirement();
        assignTask();
        managerProcess();
    }
}
