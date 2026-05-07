package Interface_e_polimorfismo.Employee;

public interface Repository <E extends Employee>{
    public void saveEntity(Employee employee);
    public void getEntityById(String id);
}
