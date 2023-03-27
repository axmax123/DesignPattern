package com.example.design.structure.DecoratorPattern;

import java.util.Date;

public class EmployeeDecorator implements EmployeeComponent{
    protected EmployeeComponent employeeComponent;
    protected EmployeeDecorator(EmployeeComponent employee) {
        this.employeeComponent = employee;
    }

    @Override
    public String getName() {
        return employeeComponent.getName();
    }

    @Override
    public void doTask() {
//        none
    }

    @Override
    public void join(Date joinDate) {
        employeeComponent.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employeeComponent.terminate(terminateDate);
    }
}
