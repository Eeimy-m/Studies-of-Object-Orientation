package javaCollections.employeePaycheck;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {
    private final Map<String, Employee> employees;

    public Company() {
        employees = new HashMap<>();
    }

    public void hire(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void fire(String id) {
        employees.remove(id);
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees.values());
    }

    public List<Employee> getEmployeesByJobTitle(String jobTitle) {
        return employees.values().stream()
                .filter(e -> e.getJobTitle().equals(jobTitle))
                .toList();
    }

    public void pay(String id) {
        employees.get(id).addPaycheck(LocalDate.now());
    }

    public void increaseSalary(String id, double newSalary) {
        employees.get(id).setSalary(newSalary);
    }

    public double averageSalary(String jobTitle) {
        return employees.values().stream()
                .filter(e -> e.getJobTitle().equals(jobTitle))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
    }

//    public double averageSalaryByDate(LocalDate startDate, LocalDate endDate) {}
}
