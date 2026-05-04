package Interface_e_polimorfismo.Employee;

public interface Repository {
    /*A interface deve prover um método para salvar uma
    entidade e outro para obter a entidade pelo id.*/

    public void saveEntity(Employee employee);
    public void getEntityById(int id);

    //Não consegui implementar generics
}
