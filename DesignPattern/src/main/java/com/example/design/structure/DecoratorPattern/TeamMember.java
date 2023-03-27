package com.example.design.structure.DecoratorPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TeamMember extends EmployeeDecorator{
    protected TeamMember(EmployeeComponent employee) {
        super(employee);
    }
    public void reportTask() {
//       log.info(this.employeeComponent.getName() + " is reporting his assigned tasks.");
        System.out.println(this.employeeComponent.getName() + " is reporting his assigned tasks.");
    }

    public void coordinateWithOthers() {
//       log.info(this.employeeComponent.getName() + " is coordinating with other members of his team.");
        System.out.println(this.employeeComponent.getName() + " is coordinating with other members of his team.");
    }
    @Override
    public void doTask() {
        employeeComponent.doTask();
        reportTask();
        coordinateWithOthers();
    }

}
