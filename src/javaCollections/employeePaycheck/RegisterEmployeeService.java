package javaCollections.employeePaycheck;

import java.util.HashMap;
import java.util.Map;

public class RegisterEmployeeService {
    private FakeRepository<String, Employee> repository = new FakeRepository<>();

    public RegisterEmployeeService(FakeRepository<String, Employee> repository) {
        this.repository = repository;
    }
}
