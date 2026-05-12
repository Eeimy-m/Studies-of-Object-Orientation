package javaCollections.employeePaycheck;

import Interface_e_polimorfismo.Employee.FakeRepository;
import Interface_e_polimorfismo.Employee.RegisterEmployeeService;

public class main {
    static void main() {
        FakeRepository repository = new FakeRepository();
        RegisterEmployeeService service = new RegisterEmployeeService(repository);

//        service.register();
    }
}
