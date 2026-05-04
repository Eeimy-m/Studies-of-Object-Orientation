package Interface_e_polimorfismo.Animals;

public interface Zoo <T extends Animal> {
    void addAnimal(T animal);
    void seeAnimalsInZoo();
}
