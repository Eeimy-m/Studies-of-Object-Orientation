package Interface_e_polimorfismo.Animals;

public class main {
    static void main() {
        Zoo zoo1 = new Zoo();

        Lion lion = new Lion();
        Wolf wolf = new Wolf();
        Owl owl = new Owl();

        zoo1.addAnimal(lion);
        zoo1.addAnimal(wolf);
        zoo1.addAnimal(owl);

        zoo1.seeAnimalsInZoo();
    }
}
