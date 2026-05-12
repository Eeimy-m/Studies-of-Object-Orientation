package Interface_e_polimorfismo.Employee;

import java.util.HashMap;
import java.util.Map;

public class FakeRepository<K,V> implements Repository<K,V> {
    /*
    classe concreta e não genérica que implemente a
    interface Repository para persistir employees na memória utilizando um array
    */

    private final Map<K,V> bd = new HashMap<>();
    private int quantity;

    @Override
    public void save(K id, V entity) {
        if(quantity < 10) bd.put(id, entity);
    }

    @Override
    public V getEntityById(K id) {
        return bd.get(id);
    }
}
