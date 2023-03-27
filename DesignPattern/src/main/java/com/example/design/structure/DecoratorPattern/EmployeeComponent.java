package com.example.design.structure.DecoratorPattern;

import lombok.extern.slf4j.Slf4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public interface EmployeeComponent {
    String getName();

    void doTask();

    void join(Date joinDate);

    void terminate(Date terminateDate);

    default String formatDate(Date theDate) {
        DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        return sdf.format(theDate);
    }

    default void showBasicInformation() {
        System.out.println("-------");
        System.out.println("The basic information of " + getName());

        join(Calendar.getInstance().getTime());

        Calendar terminateDate = Calendar.getInstance();
        terminateDate.add(Calendar.MONTH, 12);
        terminate(terminateDate.getTime());
    }

    }

