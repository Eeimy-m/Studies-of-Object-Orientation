package Heranca.Employee.Exercise;

import java.time.LocalDate;

public final class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary, String id, String name, String jobTitle, LocalDate dateOfEmployment) {
        super(id, name, jobTitle, dateOfEmployment);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double salary() {
        return monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
