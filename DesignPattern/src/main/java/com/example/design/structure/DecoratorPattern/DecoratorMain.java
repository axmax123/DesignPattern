package com.example.design.structure.DecoratorPattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorMain {
    public static void main(String[] args) {
        EmployeeComponent employee = new EmployeeCreateComponent("Drake");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM LEADER: ");
//        log.info("TEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLead(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
//        log.info("MANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
//        log.info("TEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();
    }
}
