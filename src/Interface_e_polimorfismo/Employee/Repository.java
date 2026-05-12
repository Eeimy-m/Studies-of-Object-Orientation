package Interface_e_polimorfismo.Employee;

public interface Repository <K, V>{
    void save(K key, V entity);
    V getEntityById(K key);
}
