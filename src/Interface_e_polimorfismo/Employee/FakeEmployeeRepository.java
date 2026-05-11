package Interface_e_polimorfismo.Employee;

public class FakeEmployeeRepository implements Repository<Employee>{
    /*
    classe concreta e não genérica que implemente a
    interface Repository para persistir employees na memória utilizando um array
    */

    private Employee[] fakeEmployees;
    int quantity;

    public FakeEmployeeRepository() {
        fakeEmployees = new Employee[10];
        this.quantity = 0;
    }

    @Override
    public void saveEntity(Employee employee) {
        if(quantity < 10) fakeEmployees[quantity] = employee;
    }

    @Override
    public void getEntityById(String id) {
        for(int i = 0; i < quantity; i++) {
            if(fakeEmployees[i].getId().equals(id)) System.out.println(fakeEmployees[i].toString());
        }
    }

    public Employee[] getFakeEmployees() {
        return fakeEmployees;
    }
}
