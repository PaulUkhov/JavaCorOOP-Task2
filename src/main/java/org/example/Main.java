package org.example;

import java.util.ArrayList;
import java.util.List;

//1.Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий
//        две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
//2.Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
//чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников.
//Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1993, 3, 24, 50,"Paul");
        Employee employee2 = new Employee(1992, 4, 25,10,"Ivan");
        Manager manager = new Manager(1992,2,23, 50,"Petr");
        System.out.println("Первое задание: ");
        System.out.println(employee2.equals(employee)); // Сравнение через метод equals
        int res = employee.dateComparator.compare(employee2, manager); // Сравнение через Comparator
        System.out.println(res);
        System.out.println("Второе здаание: ");
        List<Employee> workerListAndManager = new ArrayList<>();
        workerListAndManager.add(new Employee(1993, 24, 10,50, "Paul")); // Сотрудник
        workerListAndManager.add(new Manager(1992,2,23, 100,"Misha")); // Менеджер
        workerListAndManager.add(new Employee(1993, 24, 10,10, "Petr")); // Сотрудник

        Manager.payRaiseAllWorkers(workerListAndManager,100);


    }
}
