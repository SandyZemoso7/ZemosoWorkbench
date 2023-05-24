package com.zemoso.lambda;

import com.zemoso.lambda.pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeOperations {

    public static void main(String[] args){

        List<Employee> empList = new ArrayList<>();

        final String SOFTWARE_ENGINEER = "Software engineer";
        EmployeeOperations employeeOperations = new EmployeeOperations();

        empList.add(new Employee("Sandeep", SOFTWARE_ENGINEER, 30000));
        empList.add(new Employee("abhishek", SOFTWARE_ENGINEER, 20000));
        empList.add(new Employee("sijin", SOFTWARE_ENGINEER, 20000));
        empList.add(new Employee("bhavesh", SOFTWARE_ENGINEER, 50000));

        // sorting based on employee name and storing inside map as particular object based on name as key
        Map<String, Employee> employeeMap =	empList.stream()
                .sorted((e1, e2) -> e1.getName().toLowerCase().compareTo(e2.getName().toLowerCase()))
                .collect(Collectors.toMap(Employee::getName, Function.identity()));

        System.out.println("-- Employees sorted by name");
        employeeMap.forEach((k, v) -> System.out.println(k+" : "+v));

        // sort by emp first name and filter by salary > 20000
        employeeMap = empList.stream()
                .sorted((e1, e2) -> e1.getName().toLowerCase().compareTo(e2.getName().toLowerCase()))
                .filter(e -> e.getSalary() > 30000)
                .collect(Collectors.toMap(Employee::getName, Function.identity()));

        System.out.println("-- Employees with salary greater than 20000 and sorted by name:");
        employeeMap.forEach((k, v) -> System.out.println(k+" : "+v));

        List<Employee> filteredBySalary = employeeOperations.filterBySalaryGreaterThan(20000, empList);
        System.out.println("-- Employees with salary greater than 20000:");
        filteredBySalary.forEach(System.out::println);
    }

    public List<Employee> filterBySalaryGreaterThan(int salary, List<Employee> empList) {
        Predicate<Employee> bySalary = e -> e.getSalary() > salary;
        return empList.stream().filter(bySalary).toList();
    }

}
