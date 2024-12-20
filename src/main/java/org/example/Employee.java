package org.example;

import lombok.Data;

import java.util.Comparator;
import java.util.Objects;

@Data
public class Employee  {
    private String name;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer salary;

    public Employee (Integer year, Integer month, Integer day, Integer salary,String name) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
        this.name = name;
    }


    Comparator<Employee > dateComparator = (e1, e2) -> {
        // Сравнение по году
        int result = Integer.compare(e1.year, e2.year);
        // Если годы равны, сравнение по месяцу
        result = result != 0 ? result : Integer.compare(e1.month, e2.month);
        // Если месяцы равны, сравнение по дню
        return result != 0 ? result : Integer.compare(e1.day, e2.day);

    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee  worker = (Employee ) o;
        return Objects.equals(year, worker.year) && Objects.equals(month, worker.month) && Objects.equals(day, worker.day) && Objects.equals(dateComparator, worker.dateComparator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day, dateComparator);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", salary=" + salary +
                '}';
    }
}



