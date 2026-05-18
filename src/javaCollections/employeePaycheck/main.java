package javaCollections.employeePaycheck;

public class main {
    static void main() {
        FakeRepository repository = new FakeRepository();
        RegisterEmployeeService service = new RegisterEmployeeService(repository);

    }
}
