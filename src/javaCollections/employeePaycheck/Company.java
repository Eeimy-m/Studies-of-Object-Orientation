package javaCollections.employeePaycheck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void fire(String id) {
        for(Employee employee : employees) {
            if(employee.getId().equals(id)) employees.remove(employee);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Employee> getEmployeesByJobTitle(String jobTitle) {
        List<Employee> empByJobTitle = new ArrayList<>();

        for(Employee employee : employees) {
            if(employee.getJobTitle().equals(jobTitle)) empByJobTitle.add(employee);
        }

        return empByJobTitle;
    }

    public void pay(String id) {
        for(Employee employee : employees) {
            if(employee.getId().equals(id)) {
                employee.addPaycheck(LocalDate.now());
            }
        }
    }

    public void increaseSalary(String id, double newSalary) {
        for(Employee employee : employees) {
            if(employee.getId().equals(id)) employee.setSalary(newSalary);
        }
    }

    public double averageSalary(String jobTitle) {
        int sum = 0;
        int cont = 0;

        for(Employee employee : employees) {
            if(employee.getJobTitle().equals(jobTitle)) {
                sum += employee.getSalary();
                cont++;
            }
        }

        return (double) sum / cont;
    }

//    public double averageSalaryByDate(LocalDate startDate, LocalDate endDate) {}
}
