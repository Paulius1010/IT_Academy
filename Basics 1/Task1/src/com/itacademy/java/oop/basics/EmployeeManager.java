package com.itacademy.java.oop.basics;


import java.time.LocalDate;
import java.time.Month;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Chris", "Roland",  ContractType.FULL_TIME, LocalDate.of(2020, Month.JANUARY, 12), 1500000, "center");
        System.out.println(employee.toString());

    }
}
