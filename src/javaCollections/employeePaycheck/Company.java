package javaCollections.employeePaycheck;

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
}
