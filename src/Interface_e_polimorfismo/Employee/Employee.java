package Interface_e_polimorfismo.Employee;

import java.time.LocalDate;

public class Employee {
    private String id;
    private String name;
    private String jobTitle;
    private double salary;
    private LocalDate dateOfEmployment;

    public Employee(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        this.id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getId() {return id;}

    public String getName() {return name;}

    public String getJobTitle() {return  jobTitle;}

    public double getSalary() {return salary;}

    public LocalDate getDateOfEmployment() {return dateOfEmployment;}
}
