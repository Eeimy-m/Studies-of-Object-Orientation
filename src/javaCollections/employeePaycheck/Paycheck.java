package javaCollections.employeePaycheck;

import java.time.LocalDate;

public class Paycheck {
    private LocalDate payDay;
    private double salary;

    public Paycheck(LocalDate payDay, double salary) {
        this.payDay = payDay;
        this.salary = salary;
    }

    public LocalDate getPayDay() {
        return payDay;
    }

    public double getSalary() {
        return salary;
    }
}
