package Interface_e_polimorfismo.Employee;

import java.time.LocalDate;

public class RegisterEmployeeService {
    /* classe que recebe uma instância de repositório por
    injeção de dependência e fornece um método register(Employee e), que
    persiste o employee se ele já não estiver registrado no sistema.*/

    private final Repository<String, Employee> repository;

    public RegisterEmployeeService(Repository<String, Employee> repository) {
        this.repository = repository;
    }

    public void register(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        if(!validUser(id, name, jobTitle, salary, dateOfEmployment)) return;

        Employee employee = new Employee(id, name, jobTitle, salary, dateOfEmployment);
        repository.save(id, employee);
    }

    private boolean validUser(String id, String name, String jobTitle, double salary, LocalDate dateOfEmployment) {
        if(id == null || id.isBlank()) return false;
        return true;
    }
}
