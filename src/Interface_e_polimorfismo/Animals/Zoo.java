package Interface_e_polimorfismo.Animals;

public class Zoo  {
    private Animal[] animals;
    private int quantity;

    public Zoo() {
        this.animals = new Animal[10];
        this.quantity = 0;
    }

    void addAnimal(Animal animal) {
        if(quantity < animals.length) {
            animals[quantity++] = animal;
        }
    }

    void seeAnimalsInZoo() {
        for(int i = 0; i < quantity; i++) {
            animals[i].makeSound();

            if(animals[i] instanceof Runner runner) {
                runner.run();
            }
        }
    }
}
