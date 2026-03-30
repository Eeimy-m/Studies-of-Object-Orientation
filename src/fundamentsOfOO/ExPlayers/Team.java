package fundamentsOfOO.ExPlayers;

public class Team {
    private final int PLAYERS_IN_TEAM = 18;
    private final int FIELDED_PLAYERS = 11;
    private final int OUT_FIELDED_PLAYERS = 7;

    private String name, baseLocation, coachName;
    private Player captain;

    private Player[] team;
    private Player[] fieldedPlayers;
    private Player[] outFieldedPlayers;
    private int cont;

    public Team(String name, String baseLocation, String coachName, Player captain) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
        this.captain = captain;
        this.team = new Player[PLAYERS_IN_TEAM];
    }

    public void addPlayer(Player player) {
        team[cont] = player;
        cont++;
    }

    public void removePlayer(Player player) {
        int counter = -1;
        for(int i = 0; i < cont; i++) {
            if(team[i] != player) {
                counter++;
                break;
            }
        }

        if(counter >= 0) {
            team[counter] = team[cont - 1];
            team[cont - 1] = null;
//            System.out.println("Player removed");
            cont--;
        }
    }

    public void substitute(Player substitute, Player starter) {
        boolean foundSubstitute = false;
        boolean foundStarter = false;

        for(int i = 0; i < cont && !foundSubstitute; i++) {
            if(team[i] == substitute) {
                foundSubstitute = true;
            }
        }

        for(int i = 0; i < cont && !foundStarter; i++) {
            if(team[i] == starter) {
                foundStarter = true;
            }
        }

        if(foundStarter && foundSubstitute) {
            starter.bringOff();
            substitute.bringOn();
//            System.out.println("Substituição feita");
        }
    }

    public void setCaptain(Player captain) {
        for(int i = 0; i < cont; i++) {
            if(team[i] == captain) {
                this.captain = captain;
                return;
            }
        }
//        System.out.println("the player is not part of the team");
    }

    public Player[] getFieldedPlayers() {
        fieldedPlayers = new Player[FIELDED_PLAYERS];
        int contFielded = 0;

        for(int i = 0; i < cont; i++) {
            if (team[i].isFielded() && contFielded < FIELDED_PLAYERS) {
                fieldedPlayers[contFielded] = team[i];
                contFielded++;
            }
        }

        return fieldedPlayers;
    }

    public Player[] getOutfieldedPlayers() {
        outFieldedPlayers = new Player[OUT_FIELDED_PLAYERS];
        int contOutFielded = 0;

        for(int i = 0; i < cont; i++) {
            if (!team[i].isFielded()) {
                outFieldedPlayers[contOutFielded] = team[i];
                contOutFielded++;
            }
        }

        return outFieldedPlayers;
    }

    public String getName() {
        return name;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public String getCoachName() {
        return coachName;
    }

    public Player getCaptain() {
        return captain;
    }
}
