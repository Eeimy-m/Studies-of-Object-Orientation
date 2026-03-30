package fundamentsOfOO.ExPlayers;

public class Main {
    // TODO no main, instanciar jogadores, colocar em um time, fazer substituições e imprimir as listas de campo e banco.
    static void main() {
        Player elisa = new Player("Elisa", "Ataque", 10, true);
        Player joaoSilva = new Player("João Silva", "Suporte", 1, true);
        Player pedroSantos = new Player("Pedro Santos", "Sniper", 11, true);
        Player lucasOliveira = new Player("Lucas Oliveira", "Suporte", 15, true);
        Player rafaelCosta = new Player("Rafael Costa", "Ataque", 9, true);
        Player brunoFerreira = new Player("Bruno Ferreira", "Defesa", 4, true);
        Player gabrielSouza = new Player("Gabriel Souza", "Tank", 30, true);
        Player matheusLima = new Player("Matheus Lima", "Ataque", 17, true);
        Player felipeRocha = new Player("Felipe Rocha", "Defesa", 13, true);
        Player diegoMartins = new Player("Diego Martins", "Ataque", 18, true);
        Player andreAlmeida = new Player("André Almeida", "Tank", 3, true);
        Player carlosPereira = new Player("Carlos Pereira", "Ataque", 2, false);
        Player thiagoRibeiro = new Player("Thaigo Ribeiro", "Sniper", 70, false);
        Player danielGomes = new Player("Daniel Gomes", "Ataque", 54, false);
        Player edurardaBarros = new Player("Eduarda Barros", "Sniper", 65, false);
        Player vitoriaOrnellas = new Player("Vitoria Ornellas", "Ataque", 80, false);
        Player beatrizSuman = new Player("Beatriz Suman", "Suporte", 44, false);
        Player paolaRosa = new Player("Paola Rosa", "Ataque", 12, false);

        Team time1 = new Team("Time 1", "base 1", "Treinador 1", elisa);
        time1.addPlayer(elisa);
        time1.addPlayer(joaoSilva);
        time1.addPlayer(pedroSantos);
        time1.addPlayer(lucasOliveira);
        time1.addPlayer(rafaelCosta);
        time1.addPlayer(brunoFerreira);
        time1.addPlayer(gabrielSouza);
        time1.addPlayer(matheusLima);
        time1.addPlayer(felipeRocha);
        time1.addPlayer(diegoMartins);
        time1.addPlayer(andreAlmeida);
        time1.addPlayer(carlosPereira);
        time1.addPlayer(thiagoRibeiro);
        time1.addPlayer(danielGomes);
        time1.addPlayer(edurardaBarros);
        time1.addPlayer(vitoriaOrnellas);
        time1.addPlayer(beatrizSuman);
        time1.addPlayer(paolaRosa);

        Player[] fieldedPlayers = new Player[11];
        fieldedPlayers = time1.getFieldedPlayers();
        for(int i = 0; i < 11; i++) {
            System.out.println(fieldedPlayers[i].getStateAsString());
        }

        Player[] outFieldedPlayers = new Player[7];
        outFieldedPlayers = time1.getOutfieldedPlayers();
        for(int i = 0; i < 7; i++) {
            System.out.println(outFieldedPlayers[i].getStateAsString());
        }
    }
}
