package Heranca.Employee.Exercise;

public final class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTimeEmployee(double monthlySalary) {
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
