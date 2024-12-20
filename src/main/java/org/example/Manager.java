package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    String name;
    Integer salary;
    @Getter
    List<Employee> employees = new ArrayList<>();


    public Manager(Integer year, Integer month, Integer day, Integer salary, String name) {
        super(year, month, day, salary, name);
        this.name = name;

    }


    public void addWorkerAndManager(Employee employee, Manager manager) {
        employees.add(employee);
        employees.add(manager);
    }


    public static void payRaiseAllWorkers(List<Employee> employeeList, Integer increment) {

        for (Employee worker : employeeList) {
            if (!(worker instanceof Manager)) {
                Integer newPaycheck = worker.getSalary() + increment;
                System.out.println(newPaycheck + " " + worker.getName() + " - Запрлата сотрудника повышена ");
            } else {
                Manager manager = (Manager) worker;
                System.out.println(manager.getName() + " - Для руководителя нет начислений");

            }

        }

    }
}






