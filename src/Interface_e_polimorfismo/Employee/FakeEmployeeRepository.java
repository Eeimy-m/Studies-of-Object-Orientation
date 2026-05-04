package Interface_e_polimorfismo.Employee;

public class FakeEmployeeRepository implements Repository{
    /*classe concreta e não genérica que implemente a
interface Repository para persistir employees na memória utilizando um array */

    public void saveEntity(Employee employee) {

    }

    public void getEntityById(int id) {

    }
}
