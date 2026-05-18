package javaCollections.employeePaycheck;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;

public class Employee implements Entity<String> {
    private String id;
    private String name;
    private String jobTitle;
    private double salary;
    private LocalDate dateOfEmployment;

    private List<Paycheck> paychecks;

    public Employee(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public double getYearsOfService() {
        return (double) (Period.between(dateOfEmployment, LocalDate.now()).toTotalMonths()/12);
    }

    public void addPaycheck(LocalDate payDay) {
        paychecks.add(new Paycheck(payDay, salary));
    }

    public void removePaycheck(Paycheck paycheck) {
        paychecks.remove(paycheck);
    }

    public Iterator<Paycheck> iteratorPaycheck() {
        return paychecks.iterator();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
