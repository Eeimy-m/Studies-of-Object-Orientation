package Heranca;

import java.time.LocalDate;

public final class Manager extends Employee{
    private String department;

    public Manager(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment, String department) {
        setId(id);
        setName(name);
        setJobTitle(jobTitle);
        setSalary(salary);
        setDateOfEmployment(dateOfEmployment);
        this.department = department;
    }

//    public double calculateProfitSharing(double profit) {
//
//    }
}
