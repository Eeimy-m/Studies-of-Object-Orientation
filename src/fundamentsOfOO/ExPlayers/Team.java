package fundamentsOfOO.ExPlayers;

import java.util.ArrayList;

public class Team {
    private String name, baseLocation, coachName;
    private ArrayList<Player> players = new ArrayList<>(); // TODO Usar arrays, não lists. Na P1 você não poderá usar Lists.
    private Player captain;

    public Team() {}

    public Team(String name, String baseLocation, String coachName) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
        this.players = new ArrayList<>(); // TODO no caso do array, 18 posições.
    }

    public void addPlayer(Player player) {
        // TODO você só pode adicionar 11 em campo e 7 no banco.
        if(players.size() < 18)
            players.add(player);
        else
            System.out.println("The team is already full."); // TODO retorne, mas não imprima nada dentro de classes do domínio. Deixe I/O para o Main apenas.
    }

    public void removePlayer(Player player) {
        // TODO alterar a lógica para arrays, não esquecendo de limpar o array.
        if(players.size() > 0)
            players.remove(player);
        else
            System.out.println("The team is empty.");
    }

    public void substitute(Player substitute, Player starter) {
        if (players.contains(substitute) && players.contains(starter)) {

        }

        // TODO alterar a lógica para array. Mudar o estado do Player que é starter para banco (fielded false)
        //  e do que é substituto para fielded.
    }

    public void setCaptain(Player captain) {
        // TODO antes, veja se o capitão faz parte do time. =D
        this.captain = captain;
    }

    //public ArrayList<Player> getFieldedPlayes() {} // TODO retorna um array apenas com os jogadores com isFielded true

    //public ArrayList<Player> getOutfieldedPlayers() {} // TODO retorna um array apenas com os jogadores com isFielded false

}
