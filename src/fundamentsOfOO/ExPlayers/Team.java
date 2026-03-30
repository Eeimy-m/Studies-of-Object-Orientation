package fundamentsOfOO.ExPlayers;

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

    public Team(String name, String baseLocation, String coachName, Player captain) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
        //this.captain = setCaptain(captain); O código está indicando erro nessa linha
        this.team = new Player[PLAYERS_IN_TEAM];
    }

    public void addPlayer(Player player) {
        team[cont] = player;
        cont++;
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
        fieldedPlayers = new Player[FIELDED_PLAYERS];
        int contFielded = 0;

        for (Player player : team) {
            if (player.isFielded() && contFielded < FIELDED_PLAYERS) {
                fieldedPlayers[contFielded] = player;
                contFielded++;
            }
        }

        return fieldedPlayers;
    }

    public Player[] getOutfieldedPlayers() {
        outFieldedPlayers = new Player[OUT_FIELDED_PLAYERS];
        int contOutFielded = 0;

        for (Player player : team) {
            if (player.isFielded() == false) {
                outFieldedPlayers[contOutFielded] = player;
                contOutFielded++;
            }
        }

        return outFieldedPlayers;
    }
}
