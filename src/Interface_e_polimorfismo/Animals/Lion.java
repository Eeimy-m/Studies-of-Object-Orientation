package Interface_e_polimorfismo.Animals;

public class Lion extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Rrrrrwaarrr!");
    }

    public void run() {
        System.out.println("The lion is running!");
    }
}
