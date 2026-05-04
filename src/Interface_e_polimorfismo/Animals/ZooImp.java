package Interface_e_polimorfismo.Animals;

public class ZooImp implements Zoo<Animal>{
    private Animal[] animals;
    private int quantity = 0;

    public ZooImp() {
        Animal[] animals = new Animal[10];
    }

    public void addAnimal(Animal animal) {
        if(quantity < animals.length) {
            animals[quantity++] = animal;
        }
    }

    public void seeAnimalsInZoo() {
        for(int i = 0; i < quantity; i++) {
            animals[i].makeSound();
        }
    }
}
