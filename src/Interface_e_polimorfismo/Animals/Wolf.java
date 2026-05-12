package Interface_e_polimorfismo.Animals;

public class Wolf extends Animal implements Runner {
    @Override
    public void makeSound() {
        System.out.println("Auuuuuu!");
    }

    @Override
    public void run(){
        System.out.println("Wolf is running!");
    }
}
