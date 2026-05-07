package Interface_e_polimorfismo.Employee;

public class RepoImp implements Repository <Employee>{
    private Employee[] employees;
    int quantity;

    public RepoImp() {
        Employee[] employees = new Employee[10];
        quantity = 0;
    }

    public void saveEntity(Employee employee) {
        if(quantity < employees.length) {
            employees[quantity++] = employee;
        }
    }

    public void getEntityById(String id) {
        for(int i = 0; i < quantity; i++) {
            if(employees[i].getId().equals(id)) {
                System.out.println(employees[i].getName());
            }
        }
    }
}
