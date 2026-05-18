package javaCollections.employeePaycheck;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class FakeRepository<K, V extends Entity<K>> {
    private Map<K, V> repo = new HashMap<>();

    public void save(V value) {
        if(repo.containsKey(value.getId())) throw new EntityAlreadyExistsException("Entity already exists");
        K key = value.getId();
    }

    public void update(V value) {
        if(!repo.containsKey(value.getId())) throw new NoSuchElementException("Entity doesn't exist");
        repo.put(value.getId(), value);
    }

    public void remove(V value) {
        if(!repo.containsKey(value.getId())) throw new NoSuchElementException("Entity doesn't exist");
        repo.remove(value.getId());
    }
}
