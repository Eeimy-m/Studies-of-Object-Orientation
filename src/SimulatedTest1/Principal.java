package SimulatedTest1;

public class Principal {
    static void main() {
        final UserAccount factory = new UserAccount("Bogodon", "big@gmail.com");
        final UserAccount guilherme = new UserAccount("Bigodin", "bigodin@aluno.ifsp.edu.br");
        final UserAccount mary = new UserAccount("Mary", "mary@ifsp.edu.br");

        factory.acceptFollower(guilherme);
        factory.publish("Bigodes são legais");

        System.out.println("Estado do factory:");
//        System.out.println(factory.);
//        System.out.println(factory);
//        System.out.println(factory);
    }
}
