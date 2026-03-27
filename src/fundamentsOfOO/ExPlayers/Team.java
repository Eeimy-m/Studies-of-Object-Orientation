package fundamentsOfOO.ExPlayers;

import java.util.ArrayList;

public class Team {
    private String name, baseLocation, coachName;
    private Player captain;
    private Player[] team;
    private Player[] fieldedPlayers;
    private Player[] outFieldedPlayers;
    private final int PLAYERS_IN_TEAM = 18;
    private final int FIELDED_PLAYERS = 11;
    private final int OUT_FIELDED_PLAYERS = 7;
    private int cont;

    public Team(String name, String baseLocation, String coachName) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
        this.team = new Player[PLAYERS_IN_TEAM];
        this.fieldedPlayers = new Player[FIELDED_PLAYERS];
        this.outFieldedPlayers = new Player[OUT_FIELDED_PLAYERS];
        //Defino o captain aqui?
    }

    public Player[] addPlayer(Player player) {
        for (int i = 0; i < PLAYERS_IN_TEAM; i++) {
            team[i] = player;
            cont++;
        }

        return team;
    }

    //Pode ser como nas cartas? Remover o último do array e ir decrementando? Ou precisa receber qual o player a ser removido?
    public Player removePlayer() {
        Player playerToRemove = team[cont - 1];
        team[cont - 1] = null;
        cont--;
        return playerToRemove;
    }

    public void substitute(Player substitute, Player starter) {
        starter.notFielded();
        substitute.Fielded();
    }

    public void setCaptain(Player captain) {
        for (Player player : team) {
            if (player == captain) {
                this.captain = captain;
                break;
            }
        }
    }

    public Player[] getFieldedPlayers() {
        int contFielded = 0;

        for (Player player : team) {
            if (player.isFielded()) fieldedPlayers[contFielded++] = player;
        }

        return fieldedPlayers;
    }

    public Player[] getOutfieldedPlayers() {
        int contOutFielded = 0;

        for (Player player : team) {
            if (!player.isFielded()) outFieldedPlayers[contOutFielded++] = player;
        }

        return outFieldedPlayers;
    }
}
