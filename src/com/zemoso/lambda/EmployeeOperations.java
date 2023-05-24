package com.zemoso.lambda;

import com.zemoso.lambda.pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeOperations {

    public static void main(String[] args){

        List<Employee> empList = new ArrayList<>();

        final String SOFTWARE_ENGINEER = "Software engineer";
        final String SOFTWARE_TESTER = "Software Tester";
        EmployeeOperations employeeOperations = new EmployeeOperations();

        empList.add(new Employee("Sandeep", SOFTWARE_ENGINEER, 30000));
        empList.add(new Employee("abhishek", SOFTWARE_TESTER, 20000));
        empList.add(new Employee("sijin", SOFTWARE_ENGINEER, 20000));
        empList.add(new Employee("bhavesh", SOFTWARE_TESTER, 50000));

        List<Employee> filterByDesignation = employeeOperations.filterByJobDesignation(SOFTWARE_ENGINEER, empList);
        System.out.println("-- Employees filtered by designation");
        filterByDesignation.forEach(System.out::println);

        List<Employee> filteredBySalary = employeeOperations.filterBySalaryGreaterThan(20000, empList);
        System.out.println("-- Employees filtered by salary");
        filteredBySalary.forEach(System.out::println);

        List<Employee> sortedByName = employeeOperations.sortByName(empList);
        System.out.println("-- Employees sorted by name");
        sortedByName.forEach(System.out::println);
    }

    public List<Employee> filterBySalaryGreaterThan(int salary, List<Employee> empList) {
        Predicate<Employee> bySalary = e -> e.getSalary() > salary;
        return empList.stream().filter(bySalary).toList();
    }

    public List<Employee> filterByJobDesignation(String jobTitle, List<Employee> empList) {
        Predicate<Employee> byJobTitle = e -> e.getDesignation().equalsIgnoreCase(jobTitle);
        return empList.stream().filter(byJobTitle).toList();
    }

    public List<Employee> sortByName(List<Employee> empList) {
        return empList.stream()
                .sorted((e1, e2) -> e1.getName().toLowerCase().compareTo(e2.getName().toLowerCase()))
                .toList();
    }
}
