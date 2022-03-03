package com.itacademy.java.oop.basics;


import java.time.LocalDate;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee("Chris", "Roland",  ContractType.FULL_TIME, LocalDate.parse("2020-01-08"), 1500000, "center");
        System.out.println(employee.toString());

    }
}
