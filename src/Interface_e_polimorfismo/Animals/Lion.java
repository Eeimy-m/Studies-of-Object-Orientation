package Interface_e_polimorfismo.Animals;

public class Lion extends Animal implements Runner{
    @Override
    public void makeSound() {
        System.out.println("Rrrrrwaarrr!");
    }

    @Override
    public void run() {
        System.out.println("The lion is running!");
    }
}
